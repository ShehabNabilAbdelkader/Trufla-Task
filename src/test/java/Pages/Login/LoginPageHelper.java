package Pages.Login;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;

public class LoginPageHelper extends LoginPageElements {
    WebDriver driver = Hooks.getWebDriver();


public void clickLoginButton(){
    CommonHelper.clickWhenReady(loginButton,driver);
}

    public void enterValidEmail(String emailText){
        CommonHelper.sendText(email,emailText,driver);
    }

    public void enterValidPassword(String passwordText){
        CommonHelper.sendText(password,passwordText,driver);
    }






}
