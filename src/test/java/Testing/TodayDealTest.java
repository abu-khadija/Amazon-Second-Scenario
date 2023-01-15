package Testing;

import Classes.TodayDealClass;
import org.testng.annotations.Test;

public class TodayDealTest extends TestBase{

    @Test
    public void Deal(){
        TodayDealClass D;
        D = new TodayDealClass(driver);
        D.GetDeal();

    }
}
