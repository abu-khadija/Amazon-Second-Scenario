package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelectDeal_Class extends BasePage{
    public SelectDeal_Class(WebDriver driver) {super(driver);}

    private final By Headphone = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[21]/label/input");
    private final By grocery = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/input");

    private final By discount = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a");


    private final By Change_ThePage = By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[4]");






    public void SelectFilters() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(1000);

        driver.findElement(Headphone).click();
        driver.findElement(grocery).click();
        Thread.sleep(1000);


        js.executeScript("window.scrollBy(0,2400)", "");
        driver.findElement(discount).click();
        Thread.sleep(1000);


        js.executeScript("window.scrollBy(0,10300)", "");
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",driver.findElement(Change_ThePage));
        Thread.sleep(1000);
    }
}
