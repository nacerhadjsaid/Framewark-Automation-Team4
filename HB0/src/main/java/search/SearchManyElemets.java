package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchManyElemets extends CommonAPI {

    //    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
//    public WebElement searchField;
//
//    public void setSearchField(WebElement searchField) {
//        this.searchField = searchField;
//    }
//    public WebElement getSearchField() {
//        return searchField;
//    }
//    public void searchElements(){
//        List<String> itemList = getItemValue();
//        for (String string: itemList)
//        getSearchField().sendKeys(string, Keys.ENTER);
//        getSearchField().clear();
//    }
//
//    public List<String> getItemValue() {
//        List<String> itemList = new ArrayList<String>();
//        itemList.add("Spartacus");
//        itemList.add("Rome");
//        itemList.add("Cladiator");
//
//        return itemList;
//    }
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
    public WebElement searchInputField;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public WebElement searchName;

    public WebElement getSearchName() {
        return searchName;
    }

    public void setSearchName(WebElement searchName) {
        this.searchName = searchName;
    }

    public List<String> getItemValue() {
        List<String> itemList = new ArrayList<String>();
        itemList.add("Spartacus");
        itemList.add("Rome");
        itemList.add("Gladiator");
        return itemList;

    }

    public void setSearchInputField(WebElement searchInputField) {

        this.searchInputField = searchInputField;
    }

    public WebElement getSearchInputField() {

        return searchInputField;
    }

    public void searchNames() {
        List<String> itemlist = getItemValue();
        for (String items : itemlist) {
            getSearchName().click();
            //getSearchInputField() is equivalnet to -->driver.findElements(By.cssSelector(locator));
            getSearchInputField().sendKeys(items, Keys.ENTER);

        }
    }


}
