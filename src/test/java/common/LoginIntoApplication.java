package common;

import framework.AppProperties;
import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
* Created by Basheer Ahamed
*/
public class LoginIntoApplication extends WebBrowser {


    public void loginIntoBusniessOnlineShopCheckoutApplication(){
        String URL = AppProperties.getAppProperties().dsmbTestOnlineBusniesShopBaseURL;
        //WebBrowser.driver.get(URL);
        driver().get(URL);

    }


   
}