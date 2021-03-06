package TasarımDesenleri.AbstractFactoryPattern;

public interface ArabaFactory {
	public Araba getAraba(String model,String batarya,double fiyat,int km,String renk);
}
