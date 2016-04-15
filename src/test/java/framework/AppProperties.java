package framework;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Basheer Ahamed
 * This file help to load/read the prop file
 */
public class AppProperties {

    private String PROP_FILE = null;
    public static String dsmbTestOnlineBusniesShopBaseURL;
    public static AppProperties appprop;

    public AppProperties() {
        try {
            PROP_FILE = RunProperties.getRunProperties().testEnv+"-app.properties";
            System.out.println("Reading and loading"+ PROP_FILE + " Properties");
            InputStream is =  RunProperties.class.getClassLoader().getResourceAsStream(PROP_FILE);

            Properties prop = new Properties();
            prop.load(is);

            AppProperties.dsmbTestOnlineBusniesShopBaseURL = prop.getProperty("dsmbsit.baseurl");


            is.close();
            System.out.println("Reading and loading App Properties successful");
        } catch (Exception e) {
            System.out.println("Failed to read from " + PROP_FILE + " file."
                    + "\n Stack :" + e);
        }

    }

    public static AppProperties getAppProperties() {

        if (appprop == null) {
            appprop = new AppProperties();
        }

        return appprop;

    }


}

