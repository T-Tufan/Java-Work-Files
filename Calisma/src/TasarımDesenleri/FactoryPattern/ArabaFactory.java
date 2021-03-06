package TasarımDesenleri.FactoryPattern;

public class ArabaFactory {
	public static Araba getAraba(String marka,String model,double fiyat,int km ,String renk) {
		Araba araba ; 
		if("Opel".equalsIgnoreCase(marka)) {
			araba = new Opel("Opel",model,fiyat,km,renk);
		}
		else if("Mercedes".equalsIgnoreCase(marka)) {
			araba = new Mercedes("Mercedes",model,fiyat,km,renk);
		}
		else {
			throw new RuntimeException("Geçerli bir araba yok");
		}
		return araba;
	}
}
