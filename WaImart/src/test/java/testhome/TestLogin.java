package testhome;

import Home.Login;
import base.CommonAPI;
import org.testng.annotations.Test;

public class TestLogin extends Login {
    @Test
    public void testLogin() throws InterruptedException {
        Login login = new Login();
        login.clickLogin();
    }
}

