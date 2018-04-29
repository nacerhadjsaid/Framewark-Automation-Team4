package clickonelement;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ClickOnElement extends CommonAPI {

    public void clickOnElement1(){
        //clickOnxPath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a");
        driver.findElement(By.xpath("//div[@class='components/Band--maxWidth']"));
        driver.findElement(By.partialLinkText("SER"));


    }
    public void clickOnElement2(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[2]/div/a");
    }
    public void clickOnElement3(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[3]/div/a");
    }
    public void clickOnElement4(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a");
    }
    public void clickOnElement5(){
        clickByXpath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a");
    }
}
