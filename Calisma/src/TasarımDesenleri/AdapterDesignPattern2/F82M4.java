package TasarımDesenleri.AdapterDesignPattern2;

public class F82M4 extends BMW{
	public F82M4(String model, int fiyat, String kasatipi) {
		super(model,fiyat,kasatipi);
		
	}
	@Override
	public boolean OzelUretimMi() {
		// TODO Auto-generated method stub
		System.out.println("F82 M4 özel üretim bir araçtır!");
		return true;
	}
	@Override
	public int ArabaSat() {
		// TODO Auto-generated method stub
		System.out.println(super.marka+" "+model+" model araç "+fiyat+" TL satış listesine koyulmuştur");
		return fiyat;
	}
}
