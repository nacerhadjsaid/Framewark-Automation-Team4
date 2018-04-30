package Home;

import base.CommonAPI;

import java.util.concurrent.TimeUnit;

public class Home extends CommonAPI {
    public void home() {
        clickByXpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a");
        clickByXpath("//*[@id=\"react-root\"]/section/footer/div/nav/ul/li[1]/a");
        clickByXpath("//*[@id=\"link_profile\"]/a/strong");
        typeByXpath("//input[@class=\"_ph6vk _jdqpn _o716c\"]", "sabbirofficial89");
        typeByXpath("//input[@type='password']", "hellojam");
        clickByXpath("//button[@class=\"_qv64e       _gexxb _4tgw8     _njrw0   \"]");
        clickByXpath("/html/body/div/div[1]/header/div/hgroup/div/a");
        typeByXpath("//input[@type=\"text\"]", "#seleniumautomation");
        driver.navigate().to("https://www.instagram.com/explore/tags/seleniumautomation/");
    }
}