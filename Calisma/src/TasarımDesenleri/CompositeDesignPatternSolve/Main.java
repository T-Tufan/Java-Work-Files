package TasarımDesenleri.CompositeDesignPatternSolve;

import java.math.BigDecimal;

import TasarımDesenleri.CompositeDesignPatternProblem.Paket;
import TasarımDesenleri.CompositeDesignPatternProblem.Urun;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Urun domates = new Urun("domates",BigDecimal.valueOf(4.75));
		Urun patates = new Urun("Patates",BigDecimal.valueOf(3.5));
		Urun soğan = new Urun("Soğan",BigDecimal.valueOf(7.5));
		
		Urun sesSistemi = new Urun("Ses Sistemi",BigDecimal.valueOf(4500));
		Urun kulaklık = new Urun("Kulaklık",BigDecimal.valueOf(750));
		
		
		Paket sebzePaket = new Paket("Sebze Paketim");
		sebzePaket.getUruns().add(domates);
		sebzePaket.getUruns().add(patates);
		sebzePaket.getUruns().add(soğan);
		
		Paket teknolojiPaket = new Paket("Teknoloji Paketim");
		teknolojiPaket.getUruns().add(sesSistemi);
		teknolojiPaket.getUruns().add(kulaklık);
		
		Sepet sepetim = new Sepet("Benim Sepetim");
		sepetim.getFiyatlanabilirs().add((Fiyatlanabilir) sesSistemi);
		sepetim.getFiyatlanabilirs().add((Fiyatlanabilir) sebzePaket);
		sepetim.getFiyatlanabilirs().add((Fiyatlanabilir) domates);
	}

}
