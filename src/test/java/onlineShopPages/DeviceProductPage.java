package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Basheer Ahamed
 */
public class DeviceProductPage extends WebBrowser
{
    private final String SELECT_BUTTON = "//a[@id='select-variant-button']";
    private final String LINK_BUSNIESS_SHOPHOME ="a[href*='O2BusinessShopLanding']";


    public void clickSelectButton()
    {
        try
        {
            Thread.sleep(5000);
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(SELECT_BUTTON))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
