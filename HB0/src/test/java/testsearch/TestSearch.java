package testsearch;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchManyElemets;
import search.SearchOneElement;

public class TestSearch extends SearchOneElement {

    @Test
    public void oneElement() {
       searchHBO();
    }

//    @Test
//    public void manyElemets(){
//        clickOnxPath("/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div");
//        SearchManyElemets searchManyElemets = PageFactory.initElements(driver, SearchManyElemets.class);
//        searchManyElemets.searchElements();
//    }
    @Test
    public void manyElemets(){
        SearchManyElemets searchManyElemets = PageFactory.initElements(driver, SearchManyElemets.class);
        searchManyElemets.searchNames();
    }
}
