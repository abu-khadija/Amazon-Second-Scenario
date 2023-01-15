package Testing;

import Classes.BasePage;
import Classes.SelectDeal_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SelectDeal_Test extends TestBase {

    @Test
    public void SelectDeal() throws InterruptedException {
        SelectDeal_Class s;
        s = new SelectDeal_Class(driver);
        s.SelectFilters();
    }

}
