package TasarımDesenleri.CompositeDesignPatternLast;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Basket {
    private String name;
    private ArrayList<IPrice> iPrices ;

    public Basket(String name) {
        this.name = name;
        this.iPrices = new ArrayList<>();
    }
    public BigDecimal getAllPrices(){
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (IPrice iPrice : iPrices){
            totalAmount = totalAmount.add(iPrice.getProductPrice());
        }
        System.out.println("Alınan toplam ürünlerin fiyatı : "+totalAmount);
        return totalAmount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IPrice> getiPrices() {
        return iPrices;
    }

    public void setiPrices(ArrayList<IPrice> iPrices) {
        this.iPrices = iPrices;
    }
}
