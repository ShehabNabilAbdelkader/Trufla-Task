package Pages.Books;

import StepDefinition.Hooks;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;

public class BooksPageHelper extends BooksPageElements {
    WebDriver driver = Hooks.getWebDriver();


public void selectSortType(){
    CommonHelper.selectFromDropDown(sortDropDown,"Price: Low to High",driver);
}

   public void clickAddToCart(){
       CommonHelper.refreshPage(driver);
        CommonHelper.clickWhenReady(addToCart,driver);
    }

    public void clickShoppingCartLink(){
        CommonHelper.waitUntilElementAppears(shoppingCart,driver);
        CommonHelper.clickWhenReady(shoppingCart,driver);
    }

    public void verifyBooksScreenOpenedSuccessfully() {
        CommonHelper.waitUntilElementAppears(booksTitle, driver);
        CommonHelper.assertElementAppears(booksTitle, driver);
    }

}
