package onlineShopPages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Basheer Ahamed
 */
public class ReviewBasketPage extends WebBrowser {

    private static final String NEXT_BUTTON = "//div[@class='blue-button-wrapper']//a";

    public void clickOnNextButton() {
        WebBrowser.getWebdriverWaitObject().until(ExpectedConditions.presenceOfElementLocated(By.xpath(NEXT_BUTTON))).click();
    }

}
