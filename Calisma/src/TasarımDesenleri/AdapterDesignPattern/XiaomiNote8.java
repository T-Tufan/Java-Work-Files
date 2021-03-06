package TasarımDesenleri.AdapterDesignPattern;



public class XiaomiNote8 implements ITelefon{
	private int volt = 5;
	public XiaomiNote8() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int sarjEt() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi Note 8 şarj ediliyor.Verilen elektrik : "+volt+" volt");
		return volt;
	}

}
