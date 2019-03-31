package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class IPad extends CommonAPI {
    public void searchIpad() {
        driver.findElement(By.cssSelector(".header-GlobalSearch-input")).sendKeys("ipad", Keys.ENTER);
    }
    public void AppleIpad() {
        searchIpad();
        clickByXpath("//*[@id=\"searchProductResult\"]/ul/li[1]/div/div/div[2]/div/div/a/img");
    }

    public void CartIPad() {
        AppleIpad();
        driver.findElement(By.cssSelector(".button.prod-ProductCTA--primary.group1"));
    }
    public void ChecOut(){
        CartIPad();
    }

}







