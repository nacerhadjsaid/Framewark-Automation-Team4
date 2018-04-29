package clickonelement;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ClickOnElement extends CommonAPI {

    public void clickOnSeries(){
        //clickOnxPath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a");
        driver.findElement(By.xpath("//div[@class='components/Band--maxWidth']"));
        driver.findElement(By.partialLinkText("SERIES"));
    }
    public void clickOnMovies(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[2]/div/a");
    }
    public void clickOnSpecials(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[3]/div/a");
    }
    public void clickOnBoxing(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a");
    }
    public void clickOnKids(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a");
    }


}
