package TasarımDesenleri.AdapterDesignPattern2;

public class M5 extends BMW{
	public M5(String model, int fiyat, String kasatipi) {
		super(model,fiyat,kasatipi);
	}
	@Override
	public boolean OzelUretimMi() {
		// TODO Auto-generated method stub
		System.out.println("M5 özel üretim bir araç değildir!");
		return false;
	}
	@Override
	public int ArabaSat() {
		// TODO Auto-generated method stub
		System.out.println(super.marka+" "+model+" model araç "+fiyat+" TL satış listesine koyulmuştur");
		return fiyat;
	}
}
