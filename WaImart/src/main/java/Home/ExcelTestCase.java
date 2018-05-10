package Home;

import java.io.IOException;
import java.util.ArrayList;

public class ExcelTestCase extends Searchxls {
    public void excelTestCase() throws IOException{
        ArrayList<String> searchAbleUsers = null;
        try {
            searchAbleUsers = dataFromExcel("C:\\Users\\Public\\Documents\\Framwark-Automation-Team4\\WaImart\\Data\\search.xls", "Sheet1", 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < searchAbleUsers.size(); i++) {
                typeByXpath("//input[@type='text']", searchAbleUsers.get(i));
            }
    }
    private void typeByXpath(String s, String s1) {
    }
}
