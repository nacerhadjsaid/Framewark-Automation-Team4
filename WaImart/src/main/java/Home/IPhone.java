package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class IPhone extends CommonAPI {
    public void searchIphone() {
        driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys("IPhone", Keys.ENTER);
    }

    public void pickIphone() {
        searchIphone();
        clickByXpath("//*[@id=\"iPhone X\"]");
    }

    public void SearchIPhonex() {
        pickIphone();
            driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li[1]/div/div/div[2]/div/div/a/img"));
    }
}

