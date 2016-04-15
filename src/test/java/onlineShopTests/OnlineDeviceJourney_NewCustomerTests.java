package onlineShopTests;

import common.ConstantValue;
import common.ExcelReader;
import common.LoginIntoApplication;
import common.ShopHeader;
import framework.WebBrowser;
import onlineShopPages.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Basheer Ahamed.
 */


public class OnlineDeviceJourney_NewCustomerTests
{
    public static ExcelReader datatable = null;
    private ShopHeader shopHeader = new ShopHeader();
    private GroupPages groupPage = new GroupPages();
    private LandingPage landingPage = new LandingPage();
    private MobilePhoneIndexPage mobilePhoneIndexPage = new MobilePhoneIndexPage();
    private ProductBuilderPage productBuilderPage = new ProductBuilderPage();
    private LoginIntoApplication loginInCheckoutApplication = new LoginIntoApplication();
    private NewandExistingCustomerPage newandExistingCustomerPage = new NewandExistingCustomerPage();
    private DeviceProductPage deviceProductPage = new DeviceProductPage();
    private ConstantValue constantValue = new ConstantValue();
    private Step1CheckoutBusinessDetailsPage step1CheckoutBusinessDetailsPage = new Step1CheckoutBusinessDetailsPage();
    private Step2CheckoutPaymentDetailsPage step2CheckoutPaymentDetailsPage = new Step2CheckoutPaymentDetailsPage();
    private ConfirmationPage confirmationPage = new ConfirmationPage();
    private ChooseYourTariffPage chooseYourTariffPage = new ChooseYourTariffPage();
    private BusniessAppPage busniessAppPage = new BusniessAppPage();
    private BoltOnsAndExtraPage boltOnsAndExtraPage = new BoltOnsAndExtraPage();
    private ReviewBasketPage reviewBasketPage = new ReviewBasketPage();
    String FilePath = constantValue.ExcelInputFilePath();
    ExcelReader ObjExcel = new ExcelReader(FilePath);
    String DeviceName;




   @AfterTest(groups = {"ONLINESHOP"})
   public void closeBrowser() throws Exception{
      WebBrowser.closeBrowser();
   }


    /*
    Test Case : As a New Customer, Place an Online Order with App and Tariff
     */


    @Test(groups = {"ONLINESHOP","Regression"})
    public void OnlineOrderAsNewCustomerWithAppAndTariff() throws Exception {
        constantValue.currentSystemTime();
        DeviceName = ObjExcel.getCellData1("PackageBuilder","Device Name",1);


        loginInCheckoutApplication.loginIntoBusniessOnlineShopCheckoutApplication();
        shopHeader.businessShopDeviceMenu();
        mobilePhoneIndexPage.selectDevice(DeviceName);
        deviceProductPage.clickSelectButton();
        Thread.sleep(3000);
        chooseYourTariffPage.clickSelectTariff();
        chooseYourTariffPage.clickNext();
        busniessAppPage.selectApps();
        busniessAppPage.clickNext();
        boltOnsAndExtraPage.selectBolton();
        boltOnsAndExtraPage.clickNextButton();
        reviewBasketPage.clickOnNextButton();
        newandExistingCustomerPage.clickNextButton();
        step1CheckoutBusinessDetailsPage.fillStep1CheckoutBusinessDetails();
        Thread.sleep(3000);
        step2CheckoutPaymentDetailsPage.fillStep2CheckoutPaymentDetails();
        Thread.sleep(3000);
        Assert.assertTrue(confirmationPage.IsOrderConfirmationHeaderVisible(), "Order Confirmation Header is visible");
        confirmationPage.getOnlineOrderNumber();


    }
}
