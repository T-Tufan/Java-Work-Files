package TasarımDesenleri.AdapterDesignPattern2;

public class Main {
	public static void main(String args[]) {
		
		MercedesBayi mercedesBayi = new MercedesBayi();
		Mercedes cla180 = new Cla180("CLA 180",350000,"Sedan");
		Mercedes amgGt = new AmgGt("AMG GT",650000,"Sedan");
		BMW m5 = new M5("M5",450000,"Sedan");
		BMW f82 = new F82M4("F82 M4",800000,"Sedan");
		mercedesBayi.ArabaSat(amgGt);
		mercedesBayi.ArabaSat(cla180);
		BmwMercedesAdapter adapter = new BmwMercedesAdapter(m5);
		BmwMercedesAdapter adapter2 = new BmwMercedesAdapter(f82);
		mercedesBayi.ArabaSat(adapter);
		mercedesBayi.ArabaSat(adapter2);
		//mercedesBayi.ArabaSat(m5);
	}
}
