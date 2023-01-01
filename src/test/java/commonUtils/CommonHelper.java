package commonUtils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class CommonHelper {


    public static void openWebPage(String url, WebDriver driver) {
        driver.navigate().to(url);
    }


    public static void keypadEnter(WebElement element, WebDriver driver) {
        element.sendKeys(Keys.ENTER);
    }

    public static String getElementTextValue(WebElement po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String Text = wait.until(ExpectedConditions.visibilityOf(po)).getText();
        return Text;
    }

    public static String getElementAttribute(String Attribute, WebElement po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String attribute = wait.until(ExpectedConditions.visibilityOf(po)).getAttribute(Attribute);
        return attribute;
    }

    public static void waitUntilElementAppears(By po, WebDriver driver) {
        WebElement element = driver.findElement(po);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void assertElementAppears(By po, WebDriver driver) {
        WebElement element = driver.findElement(po);
        Assert.assertTrue(element.isDisplayed());
    }

    public static void clickWhenReady(By po, WebDriver driver) {
        WebElement element = driver.findElement(po);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public static void clickAfterLoad(By po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //WebElement element = driver.findElement(po);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(po)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(po))).click();
    }

    public static void selectFromDropDown(By po,String selectedItem,WebDriver driver) {
        Select element = new Select(driver.findElement(po));
        element.selectByVisibleText(selectedItem);
       // WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(element));
       // wait.until(ExpectedConditions.visibilityOf(element)).;
    }


    public static void clearField(WebElement po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(po)).clear();
    }

    public static void doubleClick(WebElement po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(po));
        Actions builder = new Actions(driver);
        builder.doubleClick(po).perform();
    }

    public static void verifyElementAppears(WebElement Po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(Po));
    }

    public static void sendText(By po, String Text, WebDriver driver) {
        WebElement element = driver.findElement(po);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(Text);
    }

    public static void addScreenshotToCucumberReport(Scenario scenario, WebDriver driver) {
        //validate if scenario has failed
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    public static void scrollToElement(WebElement po, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(po));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", po);
    }

    public static void clickUsingJS(WebElement po, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", po);
    }

    public static void sendTextUsingJS(String text, WebElement po, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementByXpath('" + po + "').value ='" + text + "'");
    }


    public static void waitElementToClickable(By po, WebDriver driver) {
        WebElement element = driver.findElement(po);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void clearCookies(WebDriver driver) {
        driver.manage().deleteAllCookies();
    }

    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

}