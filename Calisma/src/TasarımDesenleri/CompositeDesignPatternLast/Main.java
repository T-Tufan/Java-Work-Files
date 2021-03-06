package TasarımDesenleri.CompositeDesignPatternLast;

import java.math.BigDecimal;

public class Main {
    public static  void main(String args[]){

        Product domates = new Product("domates", BigDecimal.valueOf(4.75));
        Product patates = new Product("Patates",BigDecimal.valueOf(3.5));
        Product soğan = new Product("Soğan",BigDecimal.valueOf(7.5));

        Product sesSistemi = new Product("Ses Sistemi",BigDecimal.valueOf(4500));
        Product kulaklık = new Product("Kulaklık",BigDecimal.valueOf(750));

        Packet techlonogyPacket = new Packet("Teknoloji Paketi");
        techlonogyPacket.getUrunlist().add(sesSistemi);
        techlonogyPacket.getUrunlist().add(kulaklık);

        Basket basket = new Basket("Sepetim");
        basket.getiPrices().add(domates);
        basket.getiPrices().add(patates);
        basket.getiPrices().add(soğan);
        basket.getiPrices().add(techlonogyPacket);

        basket.getAllPrices();

    }
}
