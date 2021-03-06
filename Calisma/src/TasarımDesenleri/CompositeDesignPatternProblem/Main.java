package TasarımDesenleri.CompositeDesignPatternProblem;

import java.math.BigDecimal;


public class Main {
	public static void main(String args[]) {
		
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
		
		Urun tv = new Urun("Televizyon",BigDecimal.valueOf(6500));
		
		Kumanya kumanya = new Kumanya("Kumanya");
		kumanya.getPaketList().add(sebzePaket);
		kumanya.getUrunList().add(sesSistemi);
		kumanya.getPaketList().add(teknolojiPaket);
		
		Sepet sepetim = new Sepet("Alışveriş sepetim");
		sepetim.getPaketList().add(sebzePaket);
		sepetim.getPaketList().add(teknolojiPaket);
		sepetim.getUrunList().add(tv);
		sepetim.getKumanyaList().add(kumanya);
		
		///----------------------------------///
		//Burada yapısal bir problem var.Birbirine benzer çok fazla yapı kullanılıyor.
		//Sepet sınıfı ve kumanya sınıfı birbirine çok benziyor.Sepet sınıfı Kumanya sınıfınıda içine dahil ediyor.
		//Bu karmaşıklığın öüne geçmek için comosite design pattern kullanıyoruz.
		
		sepetim.getToplamTutar();
	}
}
