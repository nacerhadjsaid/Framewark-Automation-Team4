package testclickonelement;

import clickonelement.ClickOnElement;
import org.testng.annotations.Test;

public class TestClickOnElement extends ClickOnElement {
    @Test
    public void testSeries(){
        clickOnSeries();
    }
    @Test
    public void testMovies() {
        clickOnMovies();
    }
    @Test
    public void testSpecials() {
        clickOnSpecials();
    }@Test
    public void testBoxing() {
        clickOnBoxing();
    }@Test
    public void testKis() {
        clickOnKids();
    }

}
