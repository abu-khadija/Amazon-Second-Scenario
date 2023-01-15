package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TodayDealClass extends BasePage {

    public TodayDealClass(WebDriver driver) {super(driver);}

    private final By TodayDeals_Button = By.linkText("Today's Deals");



    public void GetDeal(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(TodayDeals_Button));

    }

}
