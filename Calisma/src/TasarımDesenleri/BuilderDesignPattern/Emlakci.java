package TasarımDesenleri.BuilderDesignPattern;

public class Emlakci{
	public static void main(String args[]) {
		Ev ev1 = new Ev();
		ev1.setIl("İstanbul");
		ev1.setIlçe("Kadıköy");
		ev1.setMahalle("Atatürk");
		ev1.setOdasayisi(3);
		ev1.setHasKlima(true);
		ev1.setBinayılı(2004);
	}
	private static void printEv(Ev ev) {
		System.out.println("Ev eklendi -> "+ev.toString());
	}
}