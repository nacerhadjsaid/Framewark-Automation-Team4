package Home;

import base.CommonAPI;

public class home extends CommonAPI {
    public void searchTV() {
        typeOnCss(".header-GlobalSearch-input", "Sony tv");
    }
    public void searchToys(){
        typeOnCss(".header-GlobalSearch-input", "Toys");
    }
    public void searchBikes(){ typeOnCss(".header-GlobalSearch-input", "Bikes"); }
    public void searchHoney() {
        typeOnCss(".header-GlobalSearch-input", "Honey");
    }
    public void searchBabyCloth(){
        typeOnCss(".header-GlobalSearch-input","Baby Cloth");
    }
    public void searchJewellery(){
        typeOnCss(".header-GlobalSearch-input","Jewellery");
    }
    public void searchWatch(){
        typeOnCss(".header-GlobalSearch-input","Watch");
    }
    public void searchSoap(){
        typeOnCss(".header-GlobalSearch-input","Soap");
    }
    public void searchBedSheet(){
        typeOnCss(".header-GlobalSearch-input","BedSheet");
    }
    public void searchFurniture(){
        typeOnCss(".header-GlobalSearch-input","Furniture");
    }
}

