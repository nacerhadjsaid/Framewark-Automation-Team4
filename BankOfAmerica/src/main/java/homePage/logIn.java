package homePage;

import base.CommonAPI;

public class logIn extends CommonAPI {
    public void tryLogIn(){
        clickByXpath("//*[@id=\"onlineId1\"]");
        typeByCss("#onlineId1","Open UP");
        typeByCss("#passcode1","457uyt");
        clickOnCss("#signIn");
    }
    public void logeEle(){
        clickByXpath("//*[@id=\"forgot-oid\"]");
        typeByXpath("//*[@id=\"tlpvt-account-num\"]","tomas geo");
        clickByXpath("//*[@id=\"forgot-submit\"]/span");
    }
}
