package testhome;

import Home.ReorderItems;
import org.testng.annotations.Test;

public class TestReorderItems extends ReorderItems {
    @Test
    public void testReOrder() throws InterruptedException {
        ReorderItems reorderItems = new ReorderItems();
        reorderItems.clickReOrderItems();
        sleepFor(5);
    }
    @Test
    public void test3() {
        addtocart();
    }
    @Test
    public void test4() {
        addtocartAA();
    }
}
