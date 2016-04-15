package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by Basheer Ahamed
 */
public class GroupPages extends WebBrowser {

    public void iPhoneLink() {
        driver().findElement(By.id("viewiPhone"));
    }

    public void clickAndroidPhonesLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.linkText("View phones"))).click();
    }

    public void windowsPhonelink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewwindowsPhones"))).click();
    }

    public void IpadTabletLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewipads"))).click();
    }

    public void windowsTabletLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewwindowsTablets"))).click();
    }

    public void andriodTabletLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewAndroidTablets"))).click();
    }

    public void dongleMobileInternetLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewDongles"))).click();
    }

    public void popupOfcieMobileInternetLink() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id("viewpopupOffice"))).click();
    }




    public void choosePhoneType(String ExpectedPhoneType)
    {
        WebElement PhonesList = driver.findElement(By.xpath("//*[@id='Choose-device-Heading']/following-sibling::ul[1]"));

        List<WebElement> ResCount = PhonesList.findElements(By.tagName("dt"));

        for(int iCount=0; iCount<ResCount.size(); iCount++ )
        {
            String ActualPhoneType = ResCount.get(iCount).getText();

            if(ActualPhoneType.equalsIgnoreCase(ExpectedPhoneType))
            {
                String xp1 = "//*[@id='Choose-device-Heading']/following-sibling::ul[1]/li[";
                String xp2 = "]/dl/dd/a";
                String xp = xp1+(iCount+1)+xp2;
                driver.findElement(By.xpath(xp)).click();
                break;
            }
        }
    }



    public void chooseTabletType(String ExpectedTabletType)
    {
        WebElement PhonesList = driver.findElement(By.xpath("//*[@id='Choose-device-Heading']/following-sibling::ul[2]"));

        List<WebElement> ResCount = PhonesList.findElements(By.tagName("dt"));

        for(int iCount=0; iCount<ResCount.size(); iCount++ )
        {
            String ActualPhoneType = ResCount.get(iCount).getText();

            if(ActualPhoneType.equalsIgnoreCase(ExpectedTabletType))
            {
                String xp1 = "//*[@id='Choose-device-Heading']/following-sibling::ul[2]/li[";
                String xp2 = "]/dl/dd/a";
                String xp = xp1+(iCount+1)+xp2;
                driver.findElement(By.xpath(xp)).click();
                break;
            }
        }
    }



    public static void chooseMobileInternetType(String ExpectedMobileInternetType)
    {
        WebElement PhonesList = driver.findElement(By.xpath("//*[@id='Choose-device-Heading']/following-sibling::ul[3]"));

        List<WebElement> ResCount = PhonesList.findElements(By.tagName("dt"));

        for(int iCount=0; iCount<ResCount.size(); iCount++ )
        {
            String ActualPhoneType = ResCount.get(iCount).getText();

            if(ActualPhoneType.equalsIgnoreCase(ExpectedMobileInternetType))
            {
                if(ExpectedMobileInternetType.equalsIgnoreCase("Dongles"))
                {
                    String xp1 = "//*[@id='Choose-device-Heading']/following-sibling::ul[3]/li[";
                    String xp2 = "]/dl/div/a";
                    String xp = xp1+(iCount+1)+xp2;
                    driver.findElement(By.xpath(xp)).click();
                    break;
                }
                else
                {
                    String xp1 = "//*[@id='Choose-device-Heading']/following-sibling::ul[3]/li[";
                    String xp2 = "]/dl/dd/a";
                    String xp = xp1+(iCount+1)+xp2;
                    driver.findElement(By.xpath(xp)).click();
                    break;
                }
            }
        }
    }
}
