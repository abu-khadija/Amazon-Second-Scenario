package Testing;

import Classes.AddToCart_Class;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class AddToCart_Test extends TestBase{
    @Test
    public void Add(){
        AddToCart_Class a;
        a = new AddToCart_Class(driver);
        a.Add();
    }

}
