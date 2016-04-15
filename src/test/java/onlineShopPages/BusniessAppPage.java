package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Basheer Ahamed
 */
public class BusniessAppPage extends WebBrowser {

    private static final String LINK_TARIFF ="btnChooseTariff";
    private static final String BTN_NEXT ="next-button";
    private static final String SELECT_APP ="//*[@id='BOXSTR-btn']";


    public boolean backToChooseTariff() {
        try {
            driver.findElement(By.id(LINK_TARIFF)).isSelected();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickNext() throws InterruptedException {
        Thread.sleep(4000);
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']")));
        WebElement elementtoClick = driver.findElement(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementtoClick);
        Thread.sleep(2000);
    }

    public void selectApps()
    {
        try
        {
            Thread.sleep(5000);
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(SELECT_APP))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}

