package TasarımDesenleri.AbstractFactoryPattern;

public class Opel extends Araba {

	public Opel(String marka, String model, double fiyat, int km, String renk) {
		super(marka, model, fiyat, km, renk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Opel [marka=" + marka + ", model=" + model + ", fiyat=" + fiyat + ", km=" + km + ", renk=" + renk + "]";
	}

}
