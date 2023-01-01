package Pages.Home;

import StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By booksLink = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[text()=\"Books \"]");
    By myAccountLink = By.xpath("//div[@class = \"header-links\"]/ul/li/*[@class=\"ico-account\"]");
}
