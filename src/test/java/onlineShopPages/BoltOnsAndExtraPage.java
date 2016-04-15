package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 Created by Basheer Ahamed
 */
public class BoltOnsAndExtraPage extends WebBrowser {

    private static final String LINK_APP ="btnBckToApss";
    private static final String BTN_NT = "accessory_btn";
    private static final String BTN_NEXT = "next-button";
    private static final String AddIns ="//*[@id='insurance_INSPR1']";


    public boolean backToBusniessApps() {
        try {
            driver.findElement(By.id(LINK_APP)).isSelected();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void noThanks () throws InterruptedException {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='blueRegular btnSpacing buttonInitial buttonSmall continueButton']")));
        WebElement elementtoClick = driver.findElement(By.xpath("//a[@class='blueRegular btnSpacing buttonInitial buttonSmall continueButton']"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementtoClick.getLocation().y+")");
        Thread.sleep(4000);
        elementtoClick.click();
    }

    public void clickNextButton () throws InterruptedException {

        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']")));
        WebElement elementtoClick = driver.findElement(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementtoClick.getLocation().y+")");
        Thread.sleep(4000);
        elementtoClick.click();
    }

    public void selectBolton()
    {
        try
        {
            Thread.sleep(5000);
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(AddIns))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}

