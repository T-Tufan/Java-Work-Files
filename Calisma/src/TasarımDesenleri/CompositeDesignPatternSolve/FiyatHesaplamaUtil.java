package TasarımDesenleri.CompositeDesignPatternSolve;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FiyatHesaplamaUtil {
	
	public static BigDecimal gettoplamUrunFiyat(ArrayList<Urun> urunlist) {
		BigDecimal toplamTutar = BigDecimal.ZERO;
		for(Urun urun : urunlist) {
			toplamTutar = toplamTutar.add(urun.getFiyat());
		}
		return toplamTutar;
	}
		
	public static BigDecimal gettoplamPaketFiyat(ArrayList<Paket> paketlist) {
		BigDecimal toplamTutar = BigDecimal.ZERO;
		for(Paket paket : paketlist) {
			ArrayList<Urun> urunlist = paket.getUrunList();
			toplamTutar = toplamTutar.add(paket.getfiyat());
		}
		return toplamTutar;
	}
}
