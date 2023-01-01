package Pages.Books;

import org.openqa.selenium.By;

public class BooksPageElements {
     By booksTitle = By.xpath("//div[contains(@class,'page-title')]/h1");
     By sortDropDown = By.xpath("//*[@id=\"products-orderby\"]");
     By addToCart = By.xpath("(//button[text()='Add to cart'])[2]");
     By shoppingCart = By.xpath("//div[@class = \"header-links\"]/ul/li/*[@href=\"/cart\"]");
}
