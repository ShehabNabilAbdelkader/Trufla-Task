package Pages.Cart;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;

public class CartPageHelper extends CartPageElements {
    WebDriver driver = Hooks.getWebDriver();

   public void clickTermsCheckbox(){
        CommonHelper.clickWhenReady(terms,driver);
    }

    public void clickCheckOutButton(){
        CommonHelper.clickWhenReady(checkOut,driver);
    }

    public void verifyShoppingCartScreenOpenedSuccessfully() {
        CommonHelper.waitUntilElementAppears(getCartTitle, driver);
        CommonHelper.assertElementAppears(getCartTitle, driver);
    }

}
