package testhome;

import Home.home;
import org.testng.annotations.Test;

public class TestHome extends home{
    @Test
    public void testTV(){ searchTV(); }@Test
    public void testToys(){ searchToys(); }@Test
    public void testBikes(){ searchBikes(); }@Test
    public void testHoney(){ searchHoney(); }@Test
    public void testBabyCloth(){ searchBabyCloth(); }@Test
    public void testJewellery(){ searchJewellery(); }@Test
    public void testWatch(){ searchWatch(); }@Test
    public void testSoap(){ searchSoap(); }@Test
    public void testBedSheet(){ searchBedSheet();}@Test
    public void testFurniture(){ searchFurniture();
    }
}


