package Pages.Login;

import org.openqa.selenium.By;

public class LoginPageElements {
     By email = By.id("Email");
     By password = By.id("Password");
     By loginButton = By.cssSelector(".button-1.login-button");
     By afterCheckOutTitle = By.xpath("\"//div[contains(@class,'page-title')]/h1\"");
}
