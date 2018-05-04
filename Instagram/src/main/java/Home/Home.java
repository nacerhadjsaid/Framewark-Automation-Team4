package Home;
import base.CommonAPI;
public class Home extends CommonAPI {
    public void home() throws InterruptedException {
        clickByXpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a");
        clickByXpath("//*[@id=\"react-root\"]/section/footer/div/nav/ul/li[1]/a");
        clickByXpath("//*[@id=\"link_profile\"]/a/strong");
        typeByXpath("//input[@class='_ph6vk _jdqpn _o716c']", "sabbirofficial89");
        typeByXpath("//input[@type='password']", "hellojam");
        clickByXpath("//button[@class=\"_qv64e       _gexxb _4tgw8     _njrw0   \"]");
        clickByXpath("/html/body/div/div[1]/header/div/hgroup/div/a");
        typeByXpath("//input[@type=\"text\"]","selenium");
        sleepFor(3);
        clickByXpath("//span[@class='_b01op']");
        sleepFor(5);
        clickByXpath("//a[@class='_giku3 _8scx2 coreSpriteDesktopNavLogoAndWordmark _rujh3']");
        sleepFor(1);
        clickByXpath("//a[@class=\"_f89xq\"]");
        clickByXpath("//*[@id=\"react-root\"]/section/main/article/header/section/div[1]/a/span/button");
        clickByXpath("//div[@class='_1u1jc']");
        clickByXpath("//a[@class=\"_61tuv\"]");
        clickByXpath("//select[@id=\"deletion-reason\"]");
        sleepFor(1);
        clickByXpath("//option[@value=\"need-break\"]");
        typeByXpath("//input[@type=\"password\"]", "hellojam");
        clickByXpath("//span[@class=\"_ov9ai\"]");
        sleepFor(1);
        clickByXpath("/html/body/span/section/main/div/article/div/form/div[4]/div/div[3]/span[2]/button");
        clickByXpath("//span[@class='_8scx2']");
        clickByXpath("//div[@class='_b96u5']");
    }
}