package testsearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchByDB;

import java.io.IOException;

public class TestSearchByDB extends CommonAPI{
    @Test
    public void testReadFromFile() throws IOException {
        SearchByDB searchByDB = PageFactory.initElements(driver, SearchByDB.class);
        searchByDB.searchItemsAndSubmitutton();
    }
}
