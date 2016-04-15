package onlineShopPages;

import common.ConstantValue;
import common.ExcelReader;
import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/*        Class Name      :- Step2CheckoutPaymentDetailsPage
        * Description      :- This class use all the method to enter values in Step2CheckoutPaymentDetailsPage .
        * Author           :- Basheer Ahamed.
        *
        */

public class Step2CheckoutPaymentDetailsPage extends WebBrowser {

    private final String TYPE_BANKNAME = "//span[contains(text(),'Bank or building society name')]/following-sibling::input";
    private final String TYPE_SORTCODE1 = "//span[contains(text(),'Sort code')]/following-sibling::input[1]";
    private final String TYPE_SORTCODE2 = "//span[contains(text(),'Sort code')]/following-sibling::input[2]";
    private final String TYPE_SORTCODE3 = "//span[contains(text(),'Sort code')]/following-sibling::input[3]";
    private final String TYPE_ACCOUNTNAME = "//span[contains(text(),'Account name')]/following-sibling::input";
    private final String TYPE_ACCOUNTNUMBER = "//span[contains(text(),'Account number')]/following-sibling::input";
    private final String SELECT_PREFDATE = "select[id$=preferredDDDay]";

   // private final String CHECK_CONFIRM = "o2TemplateDSMB:j_id405


    private final String CHECK_CONFIRM = "//span[contains(text(),'I confirm that my details are correct')]/preceding-sibling::input";

    private final String CHECK_CONFIRM1 = "//span[contains(text(),'I confirm that I have read and agree to')]/preceding-sibling::input";

    private final String NEXT_BUTTON = "//*[@class='accnext2 buttonInitial buttonRegular blueRegular right']";

    private final String ButtonName="//*[@id='btnContinue']/a";


    public void PaymentBankName(String PaymentBankName) {

        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BANKNAME))).sendKeys(PaymentBankName);
    }

    public void SortCode(String Sortcode) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_SORTCODE1))).sendKeys(Sortcode);
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_SORTCODE2))).sendKeys(Sortcode);
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_SORTCODE3))).sendKeys(Sortcode);
            }
    public void OrderNowButton() {
        WebElement element = driver.findElement(By.xpath(ButtonName));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        System.out.println(element.isEnabled());
        element.click();
    }
    public void AccountName(String AccountName) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_ACCOUNTNAME))).sendKeys(AccountName);
    }

    public void AccountNumber(String AccountNumber) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_ACCOUNTNUMBER))).sendKeys(AccountNumber);
    }

    public void PrefDirectDebitDate(String PrefDirectDebitDate) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_PREFDATE)));
        dropdown.selectByVisibleText(PrefDirectDebitDate);
    }

    public void CheckConfirm() {

        WebElement element1 = driver.findElement(By.xpath(CHECK_CONFIRM));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform();
        System.out.println(element1.isEnabled());
        element1.click();
    }


    public void CheckConfirm2() {
        WebElement element1 = driver.findElement(By.xpath(CHECK_CONFIRM1));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform();
        System.out.println(element1.isEnabled());
        element1.click();
    }

    public void clickNEXTButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(NEXT_BUTTON))).click();
    }

    public void fillStep2CheckoutPaymentDetails() throws Exception {
        ConstantValue constantValue = new ConstantValue();
        String FilePath = constantValue.ExcelInputFilePath();

        Step2CheckoutPaymentDetailsPage step2CheckoutPaymentDetailsPage = new Step2CheckoutPaymentDetailsPage();

        ExcelReader ObjExcel = new ExcelReader(FilePath);

        String PaymentBankName,SortCode,AccountName,AccountNumber,PrefDirectDebitDate;

        PaymentBankName= ObjExcel.getCellData1("Step2CheckoutPage", "PaymentBankName", 1);
        SortCode= ObjExcel.getCellData1("Step2CheckoutPage", "SortCode", 1);
        AccountName= ObjExcel.getCellData1("Step2CheckoutPage", "AccountName", 1);
        AccountNumber= ObjExcel.getCellData1("Step2CheckoutPage", "AccountNumber", 1);
        PrefDirectDebitDate= ObjExcel.getCellData1("Step2CheckoutPage", "PrefDirectDebitDate", 1);

       // step2CheckoutPaymentDetailsPage.PaymentBankName(PaymentBankName);
        step2CheckoutPaymentDetailsPage.AccountName(AccountName);
        step2CheckoutPaymentDetailsPage.SortCode(SortCode);
        step2CheckoutPaymentDetailsPage.AccountNumber(AccountNumber);
        step2CheckoutPaymentDetailsPage.CheckConfirm();
        step2CheckoutPaymentDetailsPage.CheckConfirm2();
        step2CheckoutPaymentDetailsPage.OrderNowButton();
    }


   
}