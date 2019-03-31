package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login extends CommonAPI {

    public void clickLogin() throws InterruptedException {
        //clickByXpath("//button[@id='header-GlobalAccountFlyout-flyout-link']");
        driver.findElement(By.id("header-GlobalAccountFlyout-flyout-link")).click();
        sleepFor(5);
        driver.findElement(By.id("header-GlobalEyebrowNav-button-5")).click();
        sleepFor(5);
    }
}
