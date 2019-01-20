package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item item;



    @Before
    public void before()  {
        item = new Item("Guitar strings", 10, 12.50 );

    }

    @Test
    public void getName() {
        assertEquals("Guitar strings", item.getName());
    }

    @Test
    public void getBuyCost() {
        assertEquals(10, item.getBuyCost(), 0.01);
    }

    @Test
    public void getSellPrice() {
        assertEquals(12.50, item.getSellPrice(), 0.01);
    }

    @Test
    public void setSellPrice() {
        item.setSellPrice(14);
        assertEquals(14, item.getSellPrice(), 0.01);
    }


    @Test
    public void calculateMarkup() {
        assertEquals(2.5, item.calculateMarkup(), 0.01);
    }
}