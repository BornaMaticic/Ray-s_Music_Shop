package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinTest {

    Violin violin;
    InstrumentType instrumentType;

    @Before
    public void before()  {
        violin = new  Violin("wood", "brown", InstrumentType.STRING, 4000, 5000, 4);
    }

    @Test
    public void getNumberOfString() {
        assertEquals(4, violin.getNumberOfString());
    }

    @Test
    public void play() {
        assertEquals("Ciguligu", violin.play("Ciguligu"));
    }
    @Test
    public void calculateMarkup() {
        assertEquals(1000, violin.calculateMarkup(), 0.01);
    }
}