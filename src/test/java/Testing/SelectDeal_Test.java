package Testing;

import Classes.BasePage;
import Classes.SelectDeal_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SelectDeal_Test extends TestBase {

    @Test
    public void SelectDeal() throws InterruptedException {
        SelectDeal_Class s;
        s = new SelectDeal_Class(driver);
        s.SelectFilters();

        //Assertion

        driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img")).isDisplayed();


    }

}
