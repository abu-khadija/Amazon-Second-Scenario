package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddToCart_Class extends BasePage{
    public AddToCart_Class(WebDriver driver) {super(driver);}


    private final By AddToCart_Button = By.id("add-to-cart-button");


    public void Add(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(AddToCart_Button));
    }
}
