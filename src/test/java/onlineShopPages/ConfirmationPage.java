package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Basheer Ahamed.
 */
public class ConfirmationPage extends WebBrowser



{
    String Header;
    // O2BusinessShopCheckout Page STEP 3 Element Locators
    private static final String ORDER_CONFIRMATION_HEADER = "confirmation";
    private static final String ORDER_NUMBER_XPATH =".//*[@id='j_id0:o2TemplateDSMB:j_id778']/div[2]/p";

    public void newCustomerOrderConfirmation()
    {
        try
        {
            Thread.sleep(3000);
            Header = driver.findElement(By.tagName("h4")).getText();
            if (Header.equalsIgnoreCase("Your order is being processed"))
            {
               System.out.println("PASS - Online Order for New Customer has been placed successfully");
             }
            else
            {
                System.out.println("FAIL - Not able to place an online order for New Customer");
            }
        }
        catch (Exception e)
        {

        }
    }

    public String getOnlineOrderNumber() {

        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(ORDER_NUMBER_XPATH)));
        WebElement element = driver.findElement(By.xpath(ORDER_NUMBER_XPATH));
        String orderNumber = element.getText().split("\n")[0].replaceAll("[^0-9]", "");
        System.out.println("NewCustomer ORDER_NUMBER :"+ orderNumber);
        return orderNumber;
    }

    public boolean IsOrderConfirmationHeaderVisible() {
        try {
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(ORDER_CONFIRMATION_HEADER)));
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.visibilityOfElementLocated(By.id(ORDER_CONFIRMATION_HEADER)));
            driver.findElement(By.id(ORDER_CONFIRMATION_HEADER)).isDisplayed();
            System.out.println("Order successfully placed");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void existingCustomerConfirmation()
    {
        try
        {
            String NewCustomerOrderNumber = null;
            Thread.sleep(3000);
            Header = driver.findElement(By.tagName("h1")).getText();
            if (Header.equalsIgnoreCase("Nearly done..."))
            {
                System.out.println("PASS - Online Order for Existing Customer has been placed successfully");
                NewCustomerOrderNumber = driver.findElement(By.tagName("b")).getText();
                System.out.println("Existing Customer Order Number :- " + NewCustomerOrderNumber);

            }
            else
            {
                System.out.println("FAIL - Not able to place an online order for Existing Customer");
            }
        }
        catch (Exception e)
        {

        }

    }

}
