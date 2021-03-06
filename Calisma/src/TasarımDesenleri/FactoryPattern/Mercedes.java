package TasarımDesenleri.FactoryPattern;

public class Mercedes extends Araba{

	public Mercedes(String marka, String model, double fiyat, int km, String renk) {
		super(marka, model, fiyat, km, renk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mercedes [marka=" + marka + ", model=" + model + ", fiyat=" + fiyat + ", km=" + km + ", renk=" + renk
				+ "]";
	}

}
