package StepDefinition.homePage;

import Pages.Books.BooksPageHelper;
import Pages.Cart.CartPageHelper;
import Pages.CheckOut.CheckOutPageHelper;
import Pages.Home.HomePageHelper;
import Pages.Login.LoginPageHelper;
import Pages.Register.RegisterPageHelper;
import commonUtils.RandomSource;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDefinition {


    HomePageHelper homePageHelper;
    RegisterPageHelper registerPageHelper;
    LoginPageHelper loginPageHelper;
    BooksPageHelper booksPageHelper;
    CartPageHelper cartPageHelper;
    CheckOutPageHelper checkOutPageHelper;
    String passwordText = RandomSource.getPassword(6);
    String emailText = RandomSource.generateRandomEmail(8);


    public HomePageStepDefinition() {
        homePageHelper = new HomePageHelper();
        registerPageHelper = new RegisterPageHelper();
        loginPageHelper = new LoginPageHelper();
        booksPageHelper = new BooksPageHelper();
        cartPageHelper = new CartPageHelper();
        checkOutPageHelper = new CheckOutPageHelper();
    }

    @Given("User Click on Register Link")
    public void clickRegisterLink() {
        homePageHelper.clickRegister();
    }

    @And("User Click on Login Link")
    public void UserClickLoginLink() {
        homePageHelper.clickLogin();
    }

    @When("User Register Successfully")
    public void registerSuccessfully() {
        registerPageHelper.enterFirstName();
        registerPageHelper.enterLastName();
        registerPageHelper.enterEmail(emailText);
        registerPageHelper.enterPassword(passwordText);
        registerPageHelper.enterConfirmPassword(passwordText);
        registerPageHelper.clickRegisterButton();
    }

    @Then("Verify User Registered Successfully")
    public void verifyUserRegisteredSuccessfully() {
        registerPageHelper.verifyRegistrationSuccessfully();
    }

    @And("User Click Continue Button")
    public void userClickContinueButton() {
        registerPageHelper.clickContinueButton();
    }

    @And("User Click Login Link")
    public void userClickLoginLink() {
        homePageHelper.clickLogin();
    }

    @And("User Login Successfully")
    public void userLoginSuccessfully() {
        loginPageHelper.enterValidEmail(emailText);
        loginPageHelper.enterValidPassword(passwordText);
        loginPageHelper.clickLoginButton();
    }

    @Then("Verify User is Logged in Successfully")
    public void verifyUserLoggedSuccessfully() {
        homePageHelper.verifyUserLoggedSuccessfully();
    }
    @And("User clicks on Books Link")
    public void userClickOnBooksLink() {
        homePageHelper.clickBooks();
    }
    @Then("Verify Books Screen is Opened Successfully")
    public void verifyBooksScreenOpenedSuccessfully() {
        booksPageHelper.verifyBooksScreenOpenedSuccessfully();
    }
    @And("User select Sort Type")
    public void userSelectSortType() {
        booksPageHelper.selectSortType();
    }
    @And("User click on Add to Cart")
    public void userClickOnAddToCart() {
        booksPageHelper.clickAddToCart();
    }
    @And("User click on Shopping Cart Link")
    public void userClickOnShoppingCartLink() {
        booksPageHelper.clickShoppingCartLink();
    }
    @Then("Verify Shopping Cart Screen is Opened Successfully")
    public void verifyShoppingCartScreenOpenedSuccessfully() {
        cartPageHelper.verifyShoppingCartScreenOpenedSuccessfully();
    }
    @And("User click on Terms Checkbox")
    public void userClickOnTermsCheckbox() {
        cartPageHelper.clickTermsCheckbox();
    }
    @And("User click on Checkout Button")
    public void userClickOnCheckoutButton() {
        cartPageHelper.clickCheckOutButton();
    }
    @Then("Verify User is Checked Out Successfully")
    public void verifyUserCheckedOutSuccessfully() {
        checkOutPageHelper.verifyUserCheckedOutSuccessfully();
    }
    @And("User fill Billing Successfully")
    public void userFillBillingSuccessfully() {
        checkOutPageHelper.selectCountry();
        checkOutPageHelper.enterCity();
        checkOutPageHelper.enterAddress();
        checkOutPageHelper.enterZipCode();
        checkOutPageHelper.enterPhoneNumber();
        checkOutPageHelper.clickBillingAddressButton();
    }
    @And("User Confirm The Order")
    public void userConfirmTHeOrder() {
        checkOutPageHelper.clickShippingMethodButton();
        checkOutPageHelper.clickPaymentMethodButton();
        checkOutPageHelper.clickPaymentInfoButton();
        checkOutPageHelper.clickConfirmButton();
    }
    @Then("Verify Order has been Processed Successfully")
    public void verifyOrderHasBeenProcessedSuccessfully() {
        checkOutPageHelper.verifyOrderProcessedSuccessfully();
        }
    }
