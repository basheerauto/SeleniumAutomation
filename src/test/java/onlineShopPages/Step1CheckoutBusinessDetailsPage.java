package onlineShopPages;

import common.ConstantValue;
import common.ExcelReader;
import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*   Class Name      :- Step1CheckoutBusinessDetailsPage
        * Description      :- This class use all the method to enter values in Step1CheckoutBusinessDetailsPage .
        * Author           :- Basheer Ahamed.
        *
        */
public class Step1CheckoutBusinessDetailsPage extends WebBrowser {



    private final String SELECT_BUSINESSTYPE = "select[id$='businessType']";
    private final String TYPE_POSTCODE="//*[@id='addressPostcode']/input[1]";
    private final String TYPE_HOMEPOSTCODE="//*[@id='homeaddressPostcode']/input[1]";
    private final String SELECT_NAMETITLE = "select[id$='title']";
    private final String SELECT_DOBDAY = "select[id$='birth_day']";
    private final String SELECT_DOBMONTH = "select[id$='birth_month']";
    private final String SELECT_DOBYEAR = "select[id$='birth_year']";
    private final String SELECT_ADDYEAR = "select[id$='previousAddrYear']";
    private final String SELECT_ADDMONTH = "select[id$='previousAddrMonth']";
    private final String TYPE_BUSINESSNAME = "//span[contains(text(),'Full trading name')]/following-sibling::input";
    private final String TYPE_BUSINESSPHONENUMBER = "//span[contains(text(),'Business phone number')]/following-sibling::input";
    private final String TYPE_BUSINESSNUMBEROFEMP = "//span[contains(text(),'Number of employees')]/following-sibling::input";
    private final String TYPE_BUSINESSFNAME = "//*[@id='personal_and_business_details']/div/div[2]/div[1]/div[1]/div[2]/input";
    private final String TYPE_BUSINESSLNAME = "//*[@id='personal_and_business_details']/div/div[2]/div[1]/div[1]/div[3]/input";
    private final String TYPE_BUSINESSCONTACTNUMBER = "//label[contains(text(),'Mobile phone number')]/following-sibling::input";
    private final String TYPE_BUSINESSEMAILE = "//*[@id='personal_and_business_details']/div/div[2]/div[1]/div[1]/div[6]/input";
    private final String TYPE_BUSINESSEMAILCONF = "//*[@id='personal_and_business_details']/div/div[2]/div[1]/div[1]/div[5]/input";
    private final String TYPE_BUSINESSROLE = "//label[contains(text(),'Position / Role')]/following-sibling::input";
    private final String TYPE_FLATNUMBER = "addrFlatNumber1";
    private final String TYPE_BUILDINGNUMBER = "addrNumber1";
    private final String TYPE_BUILDINGNAME = "addrName1";
    private final String TYPE_POSTALCODE = "input[name$='addrPostalCode1']";
    private final String TYPE_STREET = "addrStreet1";
    private final String TYPE_TOWN = "addrCity1";
    private final String TYPE_COUNTY = "addrCounty1";
    private final String NEXT_BUTTON = "Next";

    private final String SELECT_BUSINESS_ADDRESS = "select[id$='addressList']";
    private final String SELECT_HOME_ADDRESS = "select[id$='addressList2']";
    private final String BTNFIND_ADDRESS2 ="//*[starts-with(@id,'j_id0:o2TemplateDSMB:j_id36:j_id44')]";
    private final String BTNFIND_ADDRESS = "//*[starts-with(@id,'j_id0:o2TemplateDSMB:j_id36:j_id11')]";




    public void BusinessType(String BusinessType) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_BUSINESSTYPE)));
        dropdown.selectByVisibleText(BusinessType);
    }

    public void FindAddress() {
         WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(BTNFIND_ADDRESS))).click();

    }

    public void FindHomeAddress() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.xpath(BTNFIND_ADDRESS2))).click();

    }
    public void BusinessName(String BusinessName) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSNAME))).sendKeys(BusinessName);
    }

    public void BusinessPostcode(String BusinessPostcode) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_POSTCODE))).sendKeys(BusinessPostcode);
    }

    public void BusinessHomePostcode(String BusinessPostcode) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_HOMEPOSTCODE))).sendKeys(BusinessPostcode);
    }

    public void BusinessPhoneNumber(String BusinessPhoneNumber) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSPHONENUMBER))).sendKeys(BusinessPhoneNumber);
    }

    public void BusinessNumberofemployees(String BusinessNumberofemployees) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSNUMBEROFEMP))).sendKeys(BusinessNumberofemployees);
    }

    public void SelectNameTitle(String Nametitle) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_NAMETITLE)));
        dropdown.selectByVisibleText(Nametitle);
    }

    public void BusinessFName(String BusinessFName) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSFNAME))).sendKeys(BusinessFName);
    }

    public void BusinessLName(String BusinessLName) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSLNAME))).sendKeys(BusinessLName);
    }

    public void SelectDOBDay(String SelectDOBDay) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_DOBDAY)));
        dropdown.selectByVisibleText(SelectDOBDay);
    }

    public void SelectDOBMonth(String SelectDOBMonth) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_DOBMONTH)));
        dropdown.selectByVisibleText(SelectDOBMonth);
    }

    public void SelectDOBYear(String SelectDOBYear) {
       Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_DOBYEAR)));
        dropdown.selectByVisibleText(SelectDOBYear);
    }

    public void BusinessContactNumber(String BusinessContactNumber) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSCONTACTNUMBER))).sendKeys(BusinessContactNumber);
    }

    public void BusinessEmailAddress(String BusinessEmailAddress) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSEMAILE))).sendKeys(BusinessEmailAddress);
    }


    public void BusinessEmailAddressConfirm(String BusinessEmailAddressConfirm) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSEMAILCONF))).sendKeys(BusinessEmailAddressConfirm);
    }

    public void BusinessRole(String BusinessRole) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TYPE_BUSINESSROLE))).sendKeys(BusinessRole);
    }

    public void FlatNumber(String FlatNumber) {
        EnterValuesWebEditField(TYPE_FLATNUMBER,FlatNumber);
    }

    public void BuildingNumber(String BuildingNumber) {
        EnterValuesWebEditField(TYPE_BUILDINGNUMBER,BuildingNumber);
    }

    public void BuildingName(String BuildingName) {
        EnterValuesWebEditField(TYPE_BUILDINGNAME,BuildingName);
    }

    public void PostalCode(String PostalCode) {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(TYPE_POSTALCODE))).sendKeys(PostalCode);
    }

    public void Street(String Street) {
        EnterValuesWebEditField(TYPE_STREET,Street);
    }

    public void Town(String Town) {
        EnterValuesWebEditField(TYPE_TOWN,Town);
    }

    public void County(String County) {
        EnterValuesWebEditField(TYPE_COUNTY,County);
    }

    public void SelectAddYear(String SelectAddYear) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_ADDYEAR)));
        dropdown.selectByVisibleText(SelectAddYear);
    }

    public void SelectAddMonth(String SelectAddMonth) {
        Select dropdown = new Select(driver.findElement(By.cssSelector(SELECT_ADDMONTH)));
        dropdown.selectByVisibleText(SelectAddMonth);
    }

    public void clickNEXTButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.linkText(NEXT_BUTTON))).click();
    }

    public void SelectAddress(String Locator, Integer Index) {
        try {
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Locator)));
            WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.elementToBeClickable(By.cssSelector(Locator))).click();
            Select selectAddress = new Select(driver.findElement(By.cssSelector(Locator)));
            selectAddress.selectByIndex(Index);
        } catch (Exception e) {

        }}

    public static void EnterValuesWebEditField(String FieldName,String FieldValue)
    {
        String css1 = "span[id$='";
        String css2 = "']";
        String css = css1+FieldName+css2;
        WebElement ele = driver.findElement(By.cssSelector(css));
        List<WebElement> A = ele.findElements(By.tagName("input"));
        A.get(0).sendKeys(FieldValue);

    }

    public void fillStep1CheckoutBusinessDetails() throws Exception {
        ConstantValue constantValue = new ConstantValue();
        Step1CheckoutBusinessDetailsPage step1CheckoutBusinessDetailsPage = new Step1CheckoutBusinessDetailsPage();

        String BusinessType,BusinessName,BusinessPhoneNumber,BusinessNumberofemployees,SelectNameTitle,BusinessFName,BusinessLName,SelectDOBDay,SelectDOBMonth,SelectDOBYear;
        String BusinessContactNumber,BusinessEmailAddress,BusinessEmailAddressConfirm,BusinessRole,FlatNumber,BuildingNumber,BuildingName;
        String PostalCode,Street,Town,County,SelectAddYear,SelectAddMonth;
        String FilePath = constantValue.ExcelInputFilePath();
        ExcelReader ObjExcel = new ExcelReader(FilePath);

        BusinessType = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessType", 1);
        BusinessName = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessName", 1);
        BusinessPhoneNumber = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessPhoneNumber", 1);
        BusinessNumberofemployees = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessNumberofemployees", 1);
        SelectNameTitle = ObjExcel.getCellData1("Step1CheckoutPage", "SelectNameTitle", 1);
        BusinessFName = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessFName", 1);
        BusinessLName = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessLName", 1);
        SelectDOBDay = ObjExcel.getCellData1("Step1CheckoutPage", "SelectDOBDay", 1);
        SelectDOBMonth = ObjExcel.getCellData1("Step1CheckoutPage", "SelectDOBMonth", 1);
        SelectDOBYear = ObjExcel.getCellData1("Step1CheckoutPage", "SelectDOBYear", 1);
        BusinessContactNumber = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessContactNumber", 1);
        BusinessEmailAddress = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessEmailAddress", 1);
        BusinessEmailAddressConfirm = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessEmailAddressConfirm", 1);
        BusinessRole = ObjExcel.getCellData1("Step1CheckoutPage", "BusinessRole", 1);
        FlatNumber = ObjExcel.getCellData1("Step1CheckoutPage", "FlatNumber", 1);
        BuildingNumber = ObjExcel.getCellData1("Step1CheckoutPage", "BuildingNumber", 1);
        BuildingName = ObjExcel.getCellData1("Step1CheckoutPage", "BuildingName", 1);
        PostalCode = ObjExcel.getCellData1("Step1CheckoutPage", "PostalCode", 1);
        Street = ObjExcel.getCellData1("Step1CheckoutPage", "Street", 1);
        Town = ObjExcel.getCellData1("Step1CheckoutPage", "Town", 1);
        County = ObjExcel.getCellData1("Step1CheckoutPage", "County", 1);
        SelectAddYear = ObjExcel.getCellData1("Step1CheckoutPage", "SelectAddYear", 1);
        SelectAddMonth = ObjExcel.getCellData1("Step1CheckoutPage", "SelectAddMonth", 1);

        step1CheckoutBusinessDetailsPage.BusinessType(BusinessType);
        Thread.sleep(1000);
        step1CheckoutBusinessDetailsPage.BusinessName(BusinessName + constantValue.currentSystemTime());
        step1CheckoutBusinessDetailsPage.BusinessPostcode(PostalCode);
        step1CheckoutBusinessDetailsPage.FindAddress();
        Thread.sleep(1000);
        SelectAddress(SELECT_BUSINESS_ADDRESS,3);
        Thread.sleep(3000);
        step1CheckoutBusinessDetailsPage.BusinessPhoneNumber(BusinessPhoneNumber);
        step1CheckoutBusinessDetailsPage.BusinessNumberofemployees(BusinessNumberofemployees);
        step1CheckoutBusinessDetailsPage.SelectNameTitle(SelectNameTitle);
        step1CheckoutBusinessDetailsPage.BusinessFName(BusinessFName);
        step1CheckoutBusinessDetailsPage.BusinessLName(BusinessLName);
        step1CheckoutBusinessDetailsPage.SelectDOBDay(SelectDOBDay);
        step1CheckoutBusinessDetailsPage.SelectDOBMonth(SelectDOBMonth);
        step1CheckoutBusinessDetailsPage.SelectDOBYear(SelectDOBYear);
        step1CheckoutBusinessDetailsPage.BusinessContactNumber(BusinessContactNumber);
        step1CheckoutBusinessDetailsPage.BusinessEmailAddress(BusinessEmailAddress);
        step1CheckoutBusinessDetailsPage.BusinessEmailAddressConfirm(BusinessEmailAddressConfirm);

        step1CheckoutBusinessDetailsPage.BusinessHomePostcode(PostalCode);
        step1CheckoutBusinessDetailsPage.FindHomeAddress();
        Thread.sleep(1000);
        SelectAddress(SELECT_HOME_ADDRESS,5);
        Thread.sleep(3000);
        step1CheckoutBusinessDetailsPage.SelectAddYear(SelectAddYear);
        step1CheckoutBusinessDetailsPage.SelectAddMonth(SelectAddMonth);
        Thread.sleep(3000);
        step1CheckoutBusinessDetailsPage.clickNEXTButton();
    }

}




