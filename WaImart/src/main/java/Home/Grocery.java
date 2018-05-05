package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Grocery extends CommonAPI {
    public void grocery(){
    typeByCss(".GlobalHeaderSearchbar-input.header-GlobalSearch-input","Grocery");
    }
}
