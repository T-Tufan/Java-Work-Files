package TasarımDesenleri.BuilderDesignPattern;

public class Ev {
	private String il;
	private String ilçe;
	private String mahalle;
	
	private int odasayisi;
	private int banyosayisi;
	private int balkonsayisi;
	private int binayılı;
	private int tuvaletsayisi;
	
	private boolean isDublex;
	private boolean isEsya;
	private boolean hasCocukParki;
	private boolean hasKlima;
	private boolean hasOtopark;
	private boolean hasHavuz;
	
	public Ev() {
		super();
	}
	
	public Ev(String il, String ilçe, String mahalle, int odasayisi, int banyosayisi, int balkonsayisi, int binayılı,
			int tuvaletsayisi, boolean isDublex, boolean isEsya, boolean hasCocukParki, boolean hasKlima,
			boolean hasOtopark, boolean hasHavuz) {
		super();
		this.il = il;
		this.ilçe = ilçe;
		this.mahalle = mahalle;
		this.odasayisi = odasayisi;
		this.banyosayisi = banyosayisi;
		this.balkonsayisi = balkonsayisi;
		this.binayılı = binayılı;
		this.tuvaletsayisi = tuvaletsayisi;
		this.isDublex = isDublex;
		this.isEsya = isEsya;
		this.hasCocukParki = hasCocukParki;
		this.hasKlima = hasKlima;
		this.hasOtopark = hasOtopark;
		this.hasHavuz = hasHavuz;
	}
	//zorunlu
	public Ev(String il, String ilçe, String mahalle, int odasayisi, int binayılı) {
		super();
		this.il = il;
		this.ilçe = ilçe;
		this.mahalle = mahalle;
		this.odasayisi = odasayisi;
		this.binayılı = binayılı;
	}
	
	//opsiyonel oluşturuldu.
		public Ev(String il, String ilçe, String mahalle, int odasayisi, int banyosayisi, int binayılı) {
			super();
			this.il = il;
			this.ilçe = ilçe;
			this.mahalle = mahalle;
			this.odasayisi = odasayisi;
			this.banyosayisi = banyosayisi;
			this.binayılı = binayılı;
		}
	//İkinci Opsiyonel oluşturulamıyor.Java izin vermiyor.
		
		
	@Override
	public String toString() {
		return "Ev oluşturuldu! [il=" + il + ", ilçe=" + ilçe + ", mahalle=" + mahalle + ", odasayisi=" + odasayisi
				+ ", banyosayisi=" + banyosayisi + ", balkonsayisi=" + balkonsayisi + ", binayılı=" + binayılı
				+ ", tuvaletsayisi=" + tuvaletsayisi + ", isDublex=" + isDublex + ", isEsya=" + isEsya
				+ ", hasCocukParki=" + hasCocukParki + ", hasKlima=" + hasKlima + ", hasOtopark=" + hasOtopark
				+ ", hasHavuz=" + hasHavuz + "]";
	}
	
	

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlçe() {
		return ilçe;
	}

	public void setIlçe(String ilçe) {
		this.ilçe = ilçe;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public int getOdasayisi() {
		return odasayisi;
	}

	public void setOdasayisi(int odasayisi) {
		this.odasayisi = odasayisi;
	}

	public int getBanyosayisi() {
		return banyosayisi;
	}

	public void setBanyosayisi(int banyosayisi) {
		this.banyosayisi = banyosayisi;
	}

	public int getBalkonsayisi() {
		return balkonsayisi;
	}

	public void setBalkonsayisi(int balkonsayisi) {
		this.balkonsayisi = balkonsayisi;
	}

	public int getBinayılı() {
		return binayılı;
	}

	public void setBinayılı(int binayılı) {
		this.binayılı = binayılı;
	}

	public int getTuvaletsayisi() {
		return tuvaletsayisi;
	}

	public void setTuvaletsayisi(int tuvaletsayisi) {
		this.tuvaletsayisi = tuvaletsayisi;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}

	public boolean isEsya() {
		return isEsya;
	}

	public void setEsya(boolean isEsya) {
		this.isEsya = isEsya;
	}

	public boolean isHasCocukParki() {
		return hasCocukParki;
	}

	public void setHasCocukParki(boolean hasCocukParki) {
		this.hasCocukParki = hasCocukParki;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public void setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
	}

	public boolean isHasOtopark() {
		return hasOtopark;
	}

	public void setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
	}

	public boolean isHasHavuz() {
		return hasHavuz;
	}

	public void setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
	}
	
	
	
}
