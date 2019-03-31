package testhome;

import Home.IPad;
import org.testng.annotations.Test;

public class TestIpad extends IPad {
    @Test
    public void test1() throws InterruptedException {
        IPad iPad = new IPad();
        iPad.searchIpad();
        sleepFor(5);
    }
@Test

public void test2(){
        AppleIpad();
    }
@Test
    public void test3(){
        CartIPad();
}
@Test
    public void test4(){
        ChecOut();
}

}











