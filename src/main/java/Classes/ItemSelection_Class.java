package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ItemSelection_Class extends BasePage{
    public ItemSelection_Class(WebDriver driver) {super(driver);}

    private final By Item = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[4]/div/div/a/div/div/img");






    public void ChooseItem() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(Item));
        Thread.sleep(2000);


    }
}
