package TasarımDesenleri.AdapterDesignPattern;

public class Utu implements ElektrikliEvAletleri{
	private int volt = 220;
	
	public Utu() {
		
	}
	@Override
	public int prizeTakveCalistir() {
		// TODO Auto-generated method stub
		System.out.println("Ütü çalışıyor.Verilen elektrik miktarı : "+volt+" volt");
		return volt;
	}

}
