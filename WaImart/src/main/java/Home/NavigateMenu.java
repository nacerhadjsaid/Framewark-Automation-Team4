package Home;

import base.CommonAPI;
import org.openqa.selenium.By;

public class NavigateMenu extends CommonAPI {
    public void navigateMenu(){
        driver.findElement(By.cssSelector(".icon.elc-icon.elc-icon-menu"));
    }
//   public void TrackOrder(){
//        driver.findElement(By.cssSelector(".GlobalHeaderSparkMenu-optLinkText"));
//    }
}
