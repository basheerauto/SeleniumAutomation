package common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConstantValue {

    public String currentSystemTime(){
        String timeStamp = new SimpleDateFormat("HHmmssSSS").format(Calendar.getInstance().getTime());
        return timeStamp;

    }


    public String ExcelInputFilePath()
    {
        String fPath = null;

        try {
            fPath = System.getProperty("user.dir") + "/src/test/resources/InputData/TestData.xlsx";
            /* C:\BasheerTestPractice\SeleniumFramework\SeleniumAutomation\src\test\resources\InputData */
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fPath;
    }
}
