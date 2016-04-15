package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by Basheer Ahamed
 */
public class ChooseYourTariffPage extends WebBrowser {

    private static final String LINK_CHANGEDEVICE = "btnGoToDevice";
    private static final String LINK_LIST ="change-to-list-text";
    private static final String LINK_TARIFF ="tariffContent";
    private static final String CLASS_TARIFF = "tariff-upfront-cost";
    private static final String BTN_NEXT = "next-button";
    String xPath1 = "//*[@id='tariffContent']/div[1]/div[";
    String xPath2 = "]/ul[2]/li[1]/ul/li[1]";
    String xPa3 = "//*[@id='tariffContent']/div[1]/div[";
    String xPa4 = "]";
    private static final String SELECT_BUTTON="//*[@id='tariffContent']/div[1]/div[3]/ul[2]/li[1]/ul/li[1]";

    public boolean IsChangeYourDeviceLink() {
        try {
            driver.findElement(By.id(LINK_CHANGEDEVICE));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickListViewTariff(){
        driver.findElement(By.id(LINK_LIST)).click();
    }

    public void tarrifList(String UpfrontValue){

        WebElement result = driver.findElement(By.id(LINK_TARIFF));

        List<WebElement> allTariff = result.findElements(By.className(CLASS_TARIFF));

        System.out.println("Result Count " + allTariff.size());

        int jCount = allTariff.size();

        for(int icount =1; icount <= jCount; icount++){
            String newXPath = xPath1 + (icount) + xPath2;
           // System.out.println(newXPath);

            //String[] FinalUpfrontvalue = driver.findElement(By.xpath(newXPath)).getText().split("£");
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(newXPath)));

            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newXPath)));




            WebElement element = driver.findElement(By.xpath(newXPath));
            String SetFinalUpfrontValue = element.getText().replaceAll("£","");

            if(UpfrontValue.equalsIgnoreCase(SetFinalUpfrontValue)){
                String xPa = xPa3 + (icount) + xPa4;
                WebElement SelectBtn = driver.findElement(By.xpath(xPa));
                WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Select")));
                SelectBtn.findElement(By.linkText("Select")).click();
                break;
            }
        }
    }

    public void clickNext() throws InterruptedException {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']")));
        WebElement elementtoClick = driver.findElement(By.xpath("//a[@class='buttonInitial buttonLarge blueLight']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementtoClick);
    }

    public void clickSelectTariff()
    {
        try
        {
            Thread.sleep(5000);
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(SELECT_BUTTON))).click();
            String xPa = xPa3 +3+ xPa4;
           // System.out.println(xPa);
            WebElement SelectBtn = driver.findElement(By.xpath(xPa));
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Select")));
            SelectBtn.findElement(By.linkText("Select")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}

