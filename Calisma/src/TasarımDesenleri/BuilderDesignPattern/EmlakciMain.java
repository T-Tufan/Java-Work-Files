package TasarımDesenleri.BuilderDesignPattern;

public class EmlakciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ev ev1 = EvBuilder.createBuilder("İstanbul","Kadıköy","Atatürk",true,true)
		.setBinayılı(2006)
		.setBalkonsayisi(3)
		.setDublex(true)
		.setHasHavuz(false)
		.createEv();
		
		System.out.println(ev1);
	}

}
