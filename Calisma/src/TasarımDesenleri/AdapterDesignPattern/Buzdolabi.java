package TasarımDesenleri.AdapterDesignPattern;

public class Buzdolabi implements ElektrikliEvAletleri{
	private int  volt = 220;
	
	public Buzdolabi() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int prizeTakveCalistir() {
		// TODO Auto-generated method stub
		System.out.println("Buzdolabı çalışıyor.Verilen elektrik miktarı : "+volt+" volt");
		return volt;
	}
	
}
