package TasarımDesenleri.CompositeDesignPatternLast;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FiyatHesaplamaUtil {
    public static BigDecimal getPacketsProductPrice(ArrayList<Product> products){
        BigDecimal totalAmount = BigDecimal.ZERO;
        for(Product product : products){
            totalAmount = totalAmount.add(product.getPrice());
        }
        return totalAmount;
    }
    public static BigDecimal getBasketProductPrice(ArrayList<Packet> packets){
        BigDecimal totalAmount = BigDecimal.ZERO;
        for(Packet packet : packets){
            totalAmount = totalAmount.add(getPacketsProductPrice(packet.getUrunlist()));
        }
        return totalAmount;
    }
}
