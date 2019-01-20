package instruments;

public abstract class Instrument {


    private String material;
    private String colour;
    private InstrumentType type;
    private double buyCost;
    private double sellPrice;


    public Instrument(String material, String colour, InstrumentType type, double buyCost, double sellPrice) {

        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyCost = buyCost;
        this.sellPrice = buyCost * 1.25;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyCost() {
        return buyCost;
    }

    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double newPrice){
        this.sellPrice = newPrice;
    }


    public double calculateMarkup() {
        return getSellPrice() - getBuyCost();
    }

    public InstrumentType getType() {
        return type;
    }
}
