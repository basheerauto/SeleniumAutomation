package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *Created by Basheer Ahamed
 */
public class LandingPage extends WebBrowser {

    private final String CHOOSE_DEVICE = "//a[contains(text(),'Choose your device')]";
    private final String CHOOSE_APP = "//a[contains(text(),'Choose your business app')]";
    private final String CHOOSE_TARIFF = "//a[contains(text(),'Get connected')]";

    public boolean isOnHomePage (){
        try {
           WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHOOSE_DEVICE)));
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHOOSE_APP)));
                WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHOOSE_TARIFF)));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void clickChooseYourDevice(){
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHOOSE_DEVICE))).click();
    }

    public void clickChooseYourApp(){
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(CHOOSE_APP))).click();
    }

}
