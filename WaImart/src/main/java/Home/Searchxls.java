package Home;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Searchxls {
    public ArrayList<String> dataFromExcel(String path, String sheetNo, int columnNo) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet(sheetNo);
        Iterator<Row> rowIT =s.iterator();
        ArrayList<String> list = new ArrayList<String>();
        while(rowIT.hasNext()){
            list.add(rowIT.next().getCell(columnNo).getStringCellValue());
        }
        return list;
    }
}
