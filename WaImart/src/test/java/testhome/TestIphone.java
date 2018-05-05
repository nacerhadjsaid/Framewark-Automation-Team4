package testhome;

import Home.IPhone;
import org.testng.annotations.Test;

public class TestIphone extends IPhone {
    @Test
    public void test1() {
        searchIphone();
    }
    @Test
    public void test2() {
        pickIphone();
    }
    @Test
    public void test3(){ SearchIPhonex();
    }
}


