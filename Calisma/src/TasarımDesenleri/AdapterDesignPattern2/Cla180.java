package TasarımDesenleri.AdapterDesignPattern2;

public class Cla180 extends Mercedes{
	public Cla180(String model, int fiyat, String kasatipi) {
		super(model,fiyat,kasatipi);
		
	}
	public Cla180() {
		super();
	}
	@Override
	public boolean OzelUretimMi() {
		// TODO Auto-generated method stub
		System.out.println("CLA 180 özel üretim bir araç değildir!");
		return false;
	}
	@Override
	public int ArabaSat() {
		// TODO Auto-generated method stub
		System.out.println(super.marka+" "+model+" model araç "+fiyat+" TL satış listesine koyulmuştur");
		return fiyat;
	}
}
