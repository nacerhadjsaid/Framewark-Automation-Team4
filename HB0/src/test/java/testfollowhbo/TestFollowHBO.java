package testfollowhbo;

import clickonelement.FollowHBO;
import org.testng.annotations.Test;

public class TestFollowHBO extends FollowHBO{
    @Test
    public void testFacebook(){
        clickOnFollowHBOFacebbok();
    }
    @Test
    public void testTwitter(){
        clickOnFollowHBOTwitter();
    }

}
