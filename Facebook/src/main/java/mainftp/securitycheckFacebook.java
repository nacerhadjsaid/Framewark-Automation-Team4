package mainftp;

import base.CommonAPI;
import org.openqa.selenium.By;

public class securitycheckFacebook extends CommonAPI {
    public void scf(){
        driver.findElement(By.cssSelector("#email")).sendKeys("surya_bangali@mail2bangladesh.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("suryasenbangali");
        driver.findElement(By.cssSelector("#loginbutton")).click();
        driver.findElement(By.cssSelector("#checkpointSubmitButton")).click();
    }
}
