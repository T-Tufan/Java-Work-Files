package TasarımDesenleri.CompositeDesignPatternLast;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Packet implements IPrice{
    private String name;
    private ArrayList<Product> urunlist;

    public Packet(String name) {
        this.name = name;
        this.urunlist = new ArrayList<>();
    }

    @Override
    public BigDecimal getProductPrice() {
        BigDecimal totalPackageAmount = BigDecimal.ZERO;
        totalPackageAmount = FiyatHesaplamaUtil.getPacketsProductPrice(urunlist);
        System.out.println(name +" adlı paketteki ürünleri toplam fiyatı : "+totalPackageAmount+" Türk Lirası");
        return totalPackageAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getUrunlist() {
        return urunlist;
    }

    public void setUrunlist(ArrayList<Product> urunlist) {
        this.urunlist = urunlist;
    }
}
