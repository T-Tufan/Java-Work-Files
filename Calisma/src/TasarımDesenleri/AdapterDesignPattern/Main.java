package TasarımDesenleri.AdapterDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priz priz = new Priz();
		Utu utu = new Utu();
		Buzdolabi buzdolabi = new Buzdolabi();
		XiaomiNote8 note8 = new XiaomiNote8();
		TelefonEEAAdaptor adaptor = new TelefonEEAAdaptor(note8);
		
		priz.ElektrikVer(utu);
		priz.ElektrikVer(buzdolabi);
		priz.ElektrikVer(buzdolabi);
		priz.ElektrikVer(adaptor);
	}

}
