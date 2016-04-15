package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
* Created by Basheer Ahamed
*/
public class ProductBuilderPage extends WebBrowser{

    private static final String OFFICE_365_SMALL_BUSNIESS = "btnAddRemove-a4W170000008OJ6EAM";
    private static final String OFFICE_365_SMALL_BUSNIESS_PREMEUIM = "btnAddRemove-a4Wg0000000E7IZEA0";
    private static final String MCAFEE = "btnAddRemove-a4Wg0000000E7IXEA0";
    private static final String BOX_STARTER = "btnAddRemove-a4Wg0000000E7IVEA0";
    private static final String BOX_BUSNIESS = "btnAddRemove-a4Wg0000000E7IWEA0";
    private static final String INSURANCE = "insurance-title";
    private static final String ACCESSORIES = "accessories-title";
    private static final String TARIFF = "//*[@id='select-variant-button']";
    private static final String ORDER_NOW_BUTTON = "button-order-now";
    private static final String CALLING_FRIENDS = "boltons-title-link";
    private static final String INTERNATIONAL_FAVOURITES_5 ="//*[@id='boltons-text']/div/a[1]";


    public void clickAppOffice365SmallBusiness() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(OFFICE_365_SMALL_BUSNIESS))).click();
    }

    public void clickAppOffice365SmallBusinessPremiumn() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(OFFICE_365_SMALL_BUSNIESS_PREMEUIM))).click();
    }

    public void clickAppMcaffee() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(MCAFEE))).click();
    }

    public void clickAppBoxStarter() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(BOX_STARTER))).click();
    }

    public void clickAppBoxBUSNIESS() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(BOX_BUSNIESS))).click();
    }

    public void clickAppLinkO365() {
        String o365link = driver().findElement(By.className("product-family-info-link")).getAttribute("href");
    }

    public void selectTariff() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(TARIFF))).click();
    }

    public void selectInternationalFavourites() throws InterruptedException {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(CALLING_FRIENDS))).click();
        Thread.sleep(2000);
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(INTERNATIONAL_FAVOURITES_5))).click();
    }

    public void clickOrderNowButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.id(ORDER_NOW_BUTTON))).click();
    }

    public void selectApp(String appName)
    {
        String xp1 = "//h3[contains(text(),'";
        String xp2 = "')]/following-sibling::div[3]/a";
        String xp = xp1+appName+xp2;
        driver.findElement(By.xpath("//h3[contains(text(),'" + appName + "')]/following-sibling::div[3]/a")).click();
    }


}
