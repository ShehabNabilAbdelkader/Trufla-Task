package Pages.Register;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import commonUtils.RandomSource;
import org.openqa.selenium.WebDriver;

public class RegisterPageHelper extends RegisterPageElements {
    WebDriver driver = Hooks.getWebDriver();

    public void enterFirstName() {
        String firstNameText = RandomSource.generateRandomString(5);
        CommonHelper.sendText(firstname, firstNameText, driver);
    }

    public void enterLastName() {
        String lastNameText = RandomSource.generateRandomString(5);
        CommonHelper.sendText(lastname, lastNameText, driver);
    }

    public void enterEmail(String emailText) {
        CommonHelper.sendText(email, emailText, driver);
    }

    public void enterPassword(String passwordText) {
        CommonHelper.sendText(password, passwordText, driver);
    }

    public void enterConfirmPassword(String passwordText) {
        CommonHelper.sendText(confirmPassword, passwordText, driver);
    }

    public void clickRegisterButton() {
        CommonHelper.clickWhenReady(registerButton, driver);
    }

    public void verifyRegistrationSuccessfully() {
        CommonHelper.waitUntilElementAppears(successMessage, driver);
        CommonHelper.assertElementAppears(successMessage, driver);
    }

    public void clickContinueButton() {
        CommonHelper.clickWhenReady(continueButton, driver);
    }
}
