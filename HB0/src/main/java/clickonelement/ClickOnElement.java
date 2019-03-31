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
        clickByXpath("//a[text()='Movies']");
    }
    public void clickOnSpecials(){
        clickByXpath("//a[text()='Specials']");
    }
    public void clickOnBoxing(){
        clickByXpath("//a[text()='Boxing']");
    }
    public void clickOnKids(){
        clickByXpath("//a[text()='Kids']");
    }


}
