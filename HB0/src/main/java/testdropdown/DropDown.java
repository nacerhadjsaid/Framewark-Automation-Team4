package dropdown;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DropDown extends CommonAPI{

    public void dropdownmanu() throws InterruptedException {

        clickByXpath("/html//main/div[11]/div/div//ul[@class='modules/FooterLinks--links modules/FooterLinks--topLinks']//a[@href='https://hbocareers.com/']");
        handleNewTab();
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div/form/table/tbody/tr/td[1]/input")).sendKeys("SOFTWARE ENGINEER", Keys.ENTER);
        driver.manage().window().fullscreen();
        clickByXpath("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all' and @title='Area of Interest' ]");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("/html/body/div[7]/ul/li[3]");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("/html/body/div[7]/div/ul/li[3]/a/span");

    }
}
}
