package Home;

import base.CommonAPI;
import org.openqa.selenium.By;

public class StoreLocation extends CommonAPI {
    public void storeLocation() {
        driver.findElement(By.cssSelector(".BubbleButton-hoverLabel")).click();

    }

}