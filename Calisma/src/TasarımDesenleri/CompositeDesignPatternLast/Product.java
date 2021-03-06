package TasarımDesenleri.CompositeDesignPatternLast;

import java.math.BigDecimal;

public class Product implements IPrice{
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getProductPrice() {
        System.out.println(name+" adlı ürünün birim fiyatı : "+price +" Türk Lirası");
        return price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
