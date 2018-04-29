package testnavigate;

import navigate.Navigate;
import org.testng.annotations.Test;

public class TestNavigate extends Navigate{
    @Test
    public void testNavigate(){
        navigateForwardAndBack();
    }
}
