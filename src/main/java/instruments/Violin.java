package instruments;
import behaviours.IPay;

public class Violin extends Instrument implements IPay{

    private int numberOfString;


    public Violin(String material, String colour, InstrumentType type, double buyCost, double sellPrice, int numberOfString) {
        super(material, colour, type, buyCost, sellPrice);
        this.numberOfString = numberOfString;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    @Override
    public String play(String instrument){
        return "Ciguligu";
    }
}
