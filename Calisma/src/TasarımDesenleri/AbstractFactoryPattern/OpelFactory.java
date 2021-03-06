package TasarımDesenleri.AbstractFactoryPattern;

public class OpelFactory implements ArabaFactory {

	@Override
	public Araba getAraba(String model, String batarya, double fiyat, int km, String renk) {
		// TODO Auto-generated method stub
		return new Opel(model,batarya,fiyat,km,renk);
	}

}
