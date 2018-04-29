package mainftp;

import base.CommonAPI;
import org.openqa.selenium.By;

public class securitylogoutFacebook extends CommonAPI {
    public void slo(){
        driver.findElement(By.cssSelector("#email")).sendKeys("surya_bangali@mail2bangladesh.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("suryasenbangali");
        driver.findElement(By.cssSelector("#loginbutton")).click();
        driver.findElement(By.cssSelector("#checkpointSubmitButton")).click();
        driver.findElement(By.cssSelector("#js_0 > div > div > div._2t-f > div > div > a")).click();
    }
}
