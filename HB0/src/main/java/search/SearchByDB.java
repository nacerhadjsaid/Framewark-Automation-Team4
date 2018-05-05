package search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class SearchByDB {
    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[2]/span")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSubmitButtonWebElement().clear();
    }
    public void searchItemsAndSubmitutton() throws IOException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i = 1; i< value.length; i++){
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
    }
}
