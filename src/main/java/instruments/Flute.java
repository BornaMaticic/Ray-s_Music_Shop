package instruments;
import behaviours.IPay;

public class Flute extends Instrument implements IPay{

    private int numberOfValves;


    public Flute(String material, String colour, InstrumentType type, double buyCost, double sellPrice, int numberOfValves) {
        super(material, colour, type, buyCost, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    @Override
    public String play(String instrument){
        return "Flu flu flu";
    }
}