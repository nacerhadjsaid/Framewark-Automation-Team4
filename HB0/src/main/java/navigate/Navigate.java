package navigate;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Navigate extends CommonAPI{
    public void navigateForwardAndBack(){
        driver.findElement(By.xpath("//div[@class='components/Band--maxWidth']"));
        driver.findElement(By.partialLinkText("SERIES"));
        navigateBack();
        navigateForward();

    }
}
