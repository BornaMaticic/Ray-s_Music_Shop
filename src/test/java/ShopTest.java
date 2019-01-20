import behaviours.ISell;
import instruments.InstrumentType;
import instruments.Violin;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;
    private Violin violin;
    private Item strings;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Little shops of horrors");
        strings = new Item("Guitar strings", 10, 12.50 );
        violin = new Violin("wood", "brown", InstrumentType.STRING, 4000, 5000, 4);
    }

    @Test
    public void getName() {
        assertEquals("Little shops of horrors", shop.getShop());
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(strings);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void getStockSize() {
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void removeItemFromStock() {
        shop.addItemToStock(strings);
        assertEquals(1, shop.getStockSize());
        shop.removeItemFromStock(strings);
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void gettotalPotentialProfit() {
        shop.addItemToStock(strings);
        shop.addItemToStock(strings);
        shop.addItemToStock(strings);
        assertEquals(7.5, shop.getTotalPotentialProfit(), 0.001);
    }
}
