package homePageTest;

import homePage.allAboutBoa;
import org.testng.annotations.Test;

public class allBoaTest extends allAboutBoa {
    @Test
    public void test(){
        cCard();
    }
    @Test
    public void hloanT(){
        hLoan();
    }
    @Test
    public void investT(){
        invest();
    }
    @Test
    public void savingT(){
        savings();
    }
    @Test
    public void bmhT() {
        bmh();
    }
    @Test
    public void chT(){
        ch();
    }
}

