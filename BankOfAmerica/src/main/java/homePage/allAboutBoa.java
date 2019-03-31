package homePage;

import base.CommonAPI;

public class allAboutBoa extends CommonAPI {
    public void cCard() {
        clickByXpath("//*[@id=\"navCreditCards\"]/span[2]");
    }

    public void hLoan() {
        clickByXpath("//*[@id=\"navHomeLoans\"]/span[2]");
        clickByXpath("//*[@id=\"mortgages\"]");
        clickByXpath("//*[@id=\"prequalify-now-medium\"]");
    }
    public void invest(){
        clickByXpath("//*[@id=\"navInvesting\"]/span[2]");
        clickByXpath("//*[@id=\"retirementPlanning\"]");
        clickByXpath("//*[@id=\"ancMenuItem_130\"]");
        clickByXpath("//*[@id=\"OAO1a\"]");
    }
    public void savings(){
        clickByXpath("//*[@id=\"navSavings\"]/span[2]");
        clickByXpath("//*[@id=\"navSavings\"]/span[2]");
    }
    public void bmh() {
        clickByXpath("//*[@id=\"navBetterMoneyHabits\"]/span[2]");
        clickByXpath("//*[@id=\"bmhCredit\"]/span");
        clickByXpath("//*[@id=\"ItemTile__the_differences_between_apr_and_effective_apr_watch_video\"]");
        clickByXpath("//*[@id=\"ItemTile__the_differences_between_apr_and_effective_apr_watch_video\"]");
    }
    public void ch(){
        clickByXpath("//*[@id=\"navChecking\"]/span[2]");
        clickByXpath("//*[@id=\"navChecking\"]/span[2]");
        clickByXpath("//*[@id=\"interestChecking\"]");
        clickByXpath("//*[@id=\"navCheckingMobileBanking\"]");
    }
    public void homeLoan(){
        clickByXpath("//*[@id=\"prequalify-now-medium\"]");
    }

}