package Home;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ReorderItems extends CommonAPI {
    public void clickReOrderItems() {
        clickByXpath("//*[@id=\"header-ReorderLink\"]");
    }

    public void addtocart() {
        clickReOrderItems();
        clickByXpath("//*[@id='carousel_66c8f8a3-26e9-4fdb-a423-97fe04e72687_tile_3']/a");
    }

    public void addtocartAA() {
        addtocart();
        driver.findElement(By.cssSelector(".prod-ProductCTA--primary.btn.btn-primary.btn-block"));
    }

}

