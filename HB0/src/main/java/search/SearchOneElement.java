package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchOneElement extends CommonAPI{

    public void searchHBO() {
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
        driver.findElement(By.xpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")).sendKeys("Game of thrones", Keys.ENTER);
    }

}
