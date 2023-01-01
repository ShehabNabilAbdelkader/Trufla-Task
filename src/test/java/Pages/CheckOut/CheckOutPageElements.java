package Pages.CheckOut;

import org.openqa.selenium.By;

public class CheckOutPageElements {
      By checkOutTitle = By.xpath("//h1[text()=\"Checkout\"]");
      By countryDropDown = By.id("BillingNewAddress_CountryId");
      By city = By.id("BillingNewAddress_City");
      By address = By.id("BillingNewAddress_Address1");
      By zipCode = By.id("BillingNewAddress_ZipPostalCode");
      By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
      By billingAddressContinueBtn = By.xpath("//button[@onclick = \"Billing.save()\"]");
      By shippingMethodContinueBtn = By.xpath("//button[@onclick = \"ShippingMethod.save()\"]");
      By paymentMethodContinueBtn = By.xpath("//button[@onclick = \"PaymentMethod.save()\"]");
      By paymentInfoContinueBtn = By.xpath("//button[@onclick = \"PaymentInfo.save()\"]");
      By confirmButton = By.xpath("//button[text() = \"Confirm\"]");
      By verifyCompletedCheckOut = By.xpath("//div[@class = \"title\"]");
}
