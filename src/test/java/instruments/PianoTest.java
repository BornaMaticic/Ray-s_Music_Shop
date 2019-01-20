package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;
    InstrumentType instrumentType;

    @Before
    public void before()  {
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 10_000, 12_500,3);

    }

    @Test
    public void getMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void getBuyCost() {
        assertEquals(10_000, piano.getBuyCost(), 0.01);
    }

    @Test
    public void getSellPrice() {
        assertEquals(12_500, piano.getSellPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2_500, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getNumberOfPedals() {
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void play() {
        assertEquals("Ta Ta Taaa", piano.play("Ta Ta Taaa"));
    }
}