package Testing;

import Classes.NextPageClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NextPageTest extends TestBase{

    @Test
    public void Nextpage() throws InterruptedException {
        NextPageClass n;
        n = new NextPageClass(driver);

        n.NextPage();

        //Assertion

        String expectedResult = "All deals";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[1]/ul/li[1]/div/a/span")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
