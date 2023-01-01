package Pages.Home;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePageElements {
    WebDriver driver = Hooks.getWebDriver();


public void clickRegister(){
    CommonHelper.clickWhenReady(registerLink,driver);
}

    public void clickLogin(){
        CommonHelper.clickWhenReady(loginLink,driver);
    }

    public void clickBooks(){
        CommonHelper.clickWhenReady(booksLink,driver);
    }
    public void verifyUserLoggedSuccessfully() {
        CommonHelper.waitUntilElementAppears(myAccountLink, driver);
        CommonHelper.assertElementAppears(myAccountLink, driver);
    }

}
