package testExplore;

import goNavigate.SearchUsingExcel;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by mahmudurrahman
 * On 5/6/18.
 */
@Test
public class TestSearchUsingExcel extends SearchUsingExcel {
    public void testSearchUsingExcel() throws IOException {
        tryExel();
    }
}
