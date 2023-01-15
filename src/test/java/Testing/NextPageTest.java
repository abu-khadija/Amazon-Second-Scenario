package Testing;

import Classes.NextPageClass;
import org.testng.annotations.Test;

public class NextPageTest extends TestBase{

    @Test
    public void Nextpage() throws InterruptedException {
        NextPageClass n;
        n = new NextPageClass(driver);

        n.NextPage();
    }
}
