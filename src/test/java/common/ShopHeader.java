package common;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Basheer Ahamed
 * This page contain all element related to menu and sub menu.
 */
public class ShopHeader extends WebBrowser {

    private static String SUB_LINK_ALLDEVICES ="//a[contains(text(),'Connectivity')]";
    private static String MAIN_LINK_HEADER ="//div[@id='header-consumer']/nav/div/div/div[4]/ul/li[1]/a/dl";

    public void businessShopDeviceSubMenu () throws InterruptedException {

        //Get main menu web element
        WebElement menu = driver().findElement(By.xpath(MAIN_LINK_HEADER));
        //Get sub menu web element
        WebElement submenu = driver().findElement(By.xpath(SUB_LINK_ALLDEVICES));

        //Action to move over Menu and sub menu
        Actions actions = new Actions(driver());
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        actions.click(submenu).perform();
    }

    public  void  businessShopAppSubMenu(){

    }
    public  void businessShopConnectivitySubMenu(){

    }

    public void businessShopDeviceMenu() throws InterruptedException {
        
       driver.findElement(By.xpath(MAIN_LINK_HEADER)).click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        WebElement menuHoverLink = driver.findElement(By.xpath(MAIN_LINK_HEADER));
        actions.moveToElement(menuHoverLink).perform();

        WebElement subLink = driver.findElement(By.linkText("Phones"));
        actions.moveToElement(subLink);
        actions.click();
        actions.perform();

    }

    public void businessShopAppsMenu() throws InterruptedException
    {
        driver.findElement(By.xpath(MAIN_LINK_HEADER)).click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        WebElement menuHoverLink = driver.findElement(By.xpath(MAIN_LINK_HEADER));
        actions.moveToElement(menuHoverLink).perform();

        WebElement subLink = driver.findElement(By.linkText("Apps"));
        actions.moveToElement(subLink);
        actions.click();
        actions.perform();


    }
}
