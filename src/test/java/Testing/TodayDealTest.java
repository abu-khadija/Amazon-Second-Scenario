package Testing;

import Classes.TodayDealClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodayDealTest extends TestBase{

    @Test
    public void Deal(){
        TodayDealClass D;
        D = new TodayDealClass(driver);
        D.GetDeal();

        // assertion
        String expectedResult = "Today's Deals";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"slot-2\"]/div/h1")).getText();
        Assert.assertEquals(actualResult, expectedResult);


    }
}
