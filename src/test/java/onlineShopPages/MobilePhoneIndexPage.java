package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by Basheer Ahamed.
 * This Page will only consist of Identifiers
 * Make sure that we should not pass any Test data for any test case
 */
public class MobilePhoneIndexPage extends WebBrowser {

    private static final String BRAND_FILTER = "brandFilter";
    private static final String SEARCH = "searchText";
    private static final String OS_FILTER = "osFilter";
    private static final String EXPAND_ALL = "expandAll";
    private static final String REMOVE_ALL_FITER = "removeAllFilters";
    private static final String SAMSUNG_GALAXY_S5 = "//div[@id='resultList']//*[@class='blueRegular buttonInitial buttonSmall buttonWide']";


    public void searchText(String search) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(SEARCH))).sendKeys(search);
    }

    public void clickSamsungPhone() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(SAMSUNG_GALAXY_S5))).click();
    }

    public void brandFilter() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(BRAND_FILTER))).click();
    }

    public void osFilter() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(OS_FILTER))).click();
    }

    public void openAll() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(EXPAND_ALL))).click();
    }

    public void removeFilter() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(REMOVE_ALL_FITER))).click();
    }

    public void selectDevice(String DeviceName)
    {
        try
        {
            WebElement result = driver.findElement(By.id("resultList"));

            List<WebElement> ResCount = result.findElements(By.tagName("dt"));

            System.out.println("Result Count " + ResCount.size());
            int jCount = ResCount.size() / 2;

            for (int iCount = 1; iCount <= jCount; iCount++)
            {
                String xPath1 = "//*[@id='resultList']/div[";
                String xPath2 = "]/div[1]/dl/dt";
                String xPath = xPath1 + (iCount) + xPath2;
                String deviceName = driver.findElement(By.xpath(xPath)).getText().trim();
                String ActDevice = deviceName;

                if (DeviceName.equalsIgnoreCase(ActDevice))
                {
                    String xPa1 = "//*[@id='resultList']/div[";
                    String xPa2 = "]";
                    String xPa = xPa1 + (iCount) + xPa2;
                    WebElement SelectBtn = driver.findElement(By.xpath(xPa));
                    SelectBtn.findElement(By.tagName("a")).click();
                    System.out.println("Given device selected");
                    break;
                }

            }
        }
            catch (Exception e)
            {
            e.printStackTrace();
            System.out.println("Given Device '" + DeviceName +"' does not Exists. Please select Another");

        }
    }

}


