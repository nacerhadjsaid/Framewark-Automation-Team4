package menu;

import base.CommonAPI;
import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenu extends CommonAPI{
    @Test
    public void menu(){
        List<WebElement> menu = driver.findElements(By.cssSelector(".SearchDropdown-flyout"));
        for(WebElement element: menu){
            System.out.println(element.getText());
        }
    }
}
