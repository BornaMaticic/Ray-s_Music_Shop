package instruments;
import behaviours.IPay;
import instruments.Instrument;

public class Piano extends Instrument implements IPay {

    private int numberOfPedals;

    public Piano(String material, String colour, InstrumentType type, double buyCost, double sellPrice, int numberOfPedals) {
        super(material, colour, type, buyCost, sellPrice);
        this.numberOfPedals = numberOfPedals;
    }


    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    @Override
    public String play(String instrument) {
        return "Ta Ta Taaa";
    }


}