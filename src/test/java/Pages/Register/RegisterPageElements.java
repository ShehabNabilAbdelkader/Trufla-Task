package Pages.Register;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageElements {

    By firstname = By.id("FirstName");
    By lastname = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By genderMale = By.id("gender-male");
    By registerButton = By.id("register-button");
    By successMessage = By.cssSelector("div.result");
    By continueButton = By.className("register-continue-button");
}
