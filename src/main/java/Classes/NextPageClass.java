package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NextPageClass extends BasePage{
    public NextPageClass(WebDriver driver) {super(driver);}


    private final By Page4 = By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li[5]");


    public void NextPage() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10300)", "");
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",driver.findElement(Page4));
        Thread.sleep(2000);
    }

}
