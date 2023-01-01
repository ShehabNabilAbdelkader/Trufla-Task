package Pages.CheckOut;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import commonUtils.RandomSource;
import org.openqa.selenium.WebDriver;

public class CheckOutPageHelper extends CheckOutPageElements {
    WebDriver driver = Hooks.getWebDriver();

    public void selectCountry(){
        CommonHelper.selectFromDropDown(countryDropDown,"Andorra",driver);
    }
    public void enterCity(){
        String cityText = RandomSource.generateRandomString(5);
        CommonHelper.sendText(city,cityText,driver);
    }
    public void enterAddress(){
        String addressText = RandomSource.generateRandomString(5);
        CommonHelper.sendText(address,addressText,driver);
    }
    public void enterZipCode(){
        String zipCodeText = RandomSource.generateRandomNumber(5);
        CommonHelper.sendText(zipCode,zipCodeText,driver);
    }
    public void enterPhoneNumber(){
        String phoneNumberText = RandomSource.generateRandomNumber(5);
        CommonHelper.sendText(phoneNumber,phoneNumberText,driver);
    }
    public void clickBillingAddressButton(){
        CommonHelper.clickWhenReady(billingAddressContinueBtn,driver);
    }
    public void clickShippingMethodButton(){
        CommonHelper.clickWhenReady(shippingMethodContinueBtn,driver);
    }
    public void clickPaymentMethodButton(){
        CommonHelper.clickWhenReady(paymentMethodContinueBtn,driver);
    }
    public void clickPaymentInfoButton(){
        CommonHelper.clickWhenReady(paymentInfoContinueBtn,driver);
    }
    public void clickConfirmButton(){
        CommonHelper.clickWhenReady(confirmButton,driver);
    }
    public void verifyUserCheckedOutSuccessfully() {
        CommonHelper.waitUntilElementAppears(checkOutTitle, driver);
        CommonHelper.assertElementAppears(checkOutTitle, driver);
    }
    public void verifyOrderProcessedSuccessfully() {
        CommonHelper.waitUntilElementAppears(verifyCompletedCheckOut, driver);
        CommonHelper.assertElementAppears(verifyCompletedCheckOut, driver);
    }
}
