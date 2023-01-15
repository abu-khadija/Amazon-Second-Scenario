package Testing;

import Classes.ItemSelection_Class;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemSelection_Test extends TestBase{

    @Test
    public void ItemSelection() throws InterruptedException {
        ItemSelection_Class i;
        i = new ItemSelection_Class(driver);
        i.ChooseItem();


        //assertion
        String expectedResult = "Electronics";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"wayfinding-breadcrumbs_feature_div\"]/ul/li[1]/span/a")).getText();
        Assert.assertEquals(actualResult, expectedResult);


    }
}
