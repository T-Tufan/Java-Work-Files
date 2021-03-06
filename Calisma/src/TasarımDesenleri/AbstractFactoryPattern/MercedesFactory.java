package TasarımDesenleri.AbstractFactoryPattern;

public class MercedesFactory implements ArabaFactory {

	@Override
	public Araba getAraba(String model, String batarya, double fiyat, int km, String renk) {
		// TODO Auto-generated method stub
		return new Araba(model,batarya,fiyat,km,renk);
	}

}
