import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String shop;
    private ArrayList<ISell> stock;


    public Shop(String shop) {
        this.shop = shop;
        this.stock = new ArrayList<>();
    }

    public String getShop() {
        return this.shop;
    }
    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public int getStockSize(){
       return  this.stock.size();
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public double getTotalPotentialProfit(){
        double totalProfit = 0;
        for(ISell item : stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }

}
