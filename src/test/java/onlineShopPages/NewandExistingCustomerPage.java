package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Basheer Ahamed
 *
 * History
 *  - Created method "clickNextButton" to click the Next button on NewandExistingCustomerPage
 */
public class NewandExistingCustomerPage {

    public static final String TYPE_NAME = "//span[contains(text(),'Name')]/following-sibling::span/input";
    public static final String TYPE_COMPANY = "//span[contains(text(),'Company')]/following-sibling::input";
    public static final String TYPE_EMAIL = "//span[contains(text(),'Email')]/following-sibling::input";
    public static final String TYPE_O2MOBILE_NUMBER = "//span[contains(text(),'O2 mobile number')]/following-sibling::input";
    public static final String TYPE_O2ACCOUNT_NUMBER = "//span[contains(text(),'O2 account number (optional)')]/following-sibling::input";
    public static final String ORDER_BUTTON = "//*[@id='btnContinue']/a";

    public void enterName(String name) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_NAME))).sendKeys(name);
    }

    public void enterCompany(String company) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_COMPANY))).sendKeys(company);
    }

    public void enterEmail(String email) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_EMAIL))).sendKeys(email);
    }

    public void entero2MobileNumber(String mobilenumber) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_O2MOBILE_NUMBER))).sendKeys(mobilenumber);
    }

    public void entero2AccountNumberOptional(String accountnumber) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_O2ACCOUNT_NUMBER))).sendKeys(accountnumber);
    }

    public void clickOrderButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(ORDER_BUTTON))).click();
    }


    public void clickNextButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.linkText("Next"))).click();
    }

    public void fillAllDataToExistingOrderForm(String name, String company, String email, String mobilenumber, String accountnumber) {
        enterName(name);
        enterCompany(company);
        enterEmail(email);
        entero2MobileNumber(mobilenumber);
        entero2AccountNumberOptional(accountnumber);
    }
}
