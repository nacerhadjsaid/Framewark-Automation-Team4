package goNavigate;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Created by mahmudurrahman
 * On 5/1/18.
 */
public class DoExplore extends CommonAPI {
    public void playArround() throws InterruptedException {
        clickByXpath("//a[text()='Contact Harvard']");
        navigateBack();
        driver.get("https://youtu.be/Oi9LBSYZgEk"); // open browser at youtube video.

        WebElement video = driver.findElement(By.id("movie_player"));
        // implicite wait
        sleepFor(6);
        video.click(); // pause the video
        driver.navigate().to("https://www.harvard.edu/");
        clickByXpath("//*[@id=\"siteNavigation\"]/div/div[3]/ul/li[4]/a");
        sleepFor(5);
        driver.get("https://news.harvard.edu/gazette/story/2018/04/chimamanda-ngozi-adichie-named-harvards-class-day-speaker/");
        sleepFor(5);
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        sleepFor(5);
        jsx.executeScript("window.scrollBy(0,900)", "");
        jsx.executeScript("window.scrollBy(0,900)", "");
        jsx.executeScript("window.scrollBy(0,900)", "");
        sleepFor(5);

    }
}
