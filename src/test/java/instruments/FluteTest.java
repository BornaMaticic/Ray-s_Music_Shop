package instruments;

import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Instrument;

import static org.junit.Assert.*;

public class FluteTest {

    Flute flute;
    InstrumentType instrumentType;

    @Before
    public void before()  {
        flute = new Flute("wood", "white", InstrumentType.WIND, 500, 625, 5);
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(5, flute.getNumberOfValves()) ;
    }

    @Test
    public void play() {
        assertEquals("Flu flu flu", flute.play("Flu flu flu"));
    }
}