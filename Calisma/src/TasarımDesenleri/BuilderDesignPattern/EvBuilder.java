package TasarımDesenleri.BuilderDesignPattern;

public class EvBuilder {
	@Override
	public String toString() {
		return "EvBuilder [il=" + il + ", ilçe=" + ilçe + ", mahalle=" + mahalle + ", odasayisi=" + odasayisi
				+ ", banyosayisi=" + banyosayisi + ", balkonsayisi=" + balkonsayisi + ", binayılı=" + binayılı
				+ ", tuvaletsayisi=" + tuvaletsayisi + ", isDublex=" + isDublex + ", isEsya=" + isEsya
				+ ", hasCocukParki=" + hasCocukParki + ", hasKlima=" + hasKlima + ", hasOtopark=" + hasOtopark
				+ ", hasHavuz=" + hasHavuz + "]";
	}

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
	
	//Kendi boş nesnesini dönen metot.
	public static EvBuilder createBuilder(String il,String ilçe,String mahalle,boolean hasOtopark,boolean isEsya) {
		EvBuilder  evBuilder = new EvBuilder();
		evBuilder.setIl(il);
		evBuilder.setIlçe(ilçe);
		evBuilder.setMahalle(mahalle);
		evBuilder.setHasOtopark(hasOtopark);
		evBuilder.setEsya(isEsya);
		
		return evBuilder;
	}
	
	public Ev createEv() {
		Ev ev = new Ev();
		
		ev.setIl(il);
		ev.setIlçe(ilçe);
		ev.setMahalle(mahalle);
		
		ev.setOdasayisi(odasayisi);
		ev.setBanyosayisi(banyosayisi);
		ev.setBalkonsayisi(balkonsayisi);
		ev.setBinayılı(binayılı);
		ev.setTuvaletsayisi(tuvaletsayisi);
		
		ev.setDublex(isDublex);
		ev.setEsya(isEsya);
		ev.setHasCocukParki(hasCocukParki);
		ev.setHasKlima(hasKlima);
		ev.setHasOtopark(hasOtopark);
		ev.setHasHavuz(hasHavuz);
		
		return ev;
		
	}
	public String getIl() {
		return il;
	}

	public EvBuilder setIl(String il) {
		this.il = il;
		return this;
	}

	public String getIlçe() {
		return ilçe;
	}

	public EvBuilder setIlçe(String ilçe) {
		this.ilçe = ilçe;
		return this;
	}

	public String getMahalle() {
		return mahalle;
	}

	public EvBuilder setMahalle(String mahalle) {
		this.mahalle = mahalle;
		return this;
	}

	public int getOdasayisi() {
		return odasayisi;
	}

	public EvBuilder setOdasayisi(int odasayisi) {
		this.odasayisi = odasayisi;
		return this;
	}

	public int getBanyosayisi() {
		return banyosayisi;
	}

	public EvBuilder setBanyosayisi(int banyosayisi) {
		this.banyosayisi = banyosayisi;
		return this;
	}

	public int getBalkonsayisi() {
		return balkonsayisi;
	}

	public EvBuilder setBalkonsayisi(int balkonsayisi) {
		this.balkonsayisi = balkonsayisi;
		return this;
	}

	public int getBinayılı() {
		return binayılı;
	}

	public EvBuilder setBinayılı(int binayılı) {
		this.binayılı = binayılı;
		return this;
	}

	public int getTuvaletsayisi() {
		return tuvaletsayisi;
	}

	public EvBuilder setTuvaletsayisi(int tuvaletsayisi) {
		this.tuvaletsayisi = tuvaletsayisi;
		return this;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public EvBuilder setDublex(boolean isDublex) {
		this.isDublex = isDublex;
		return this;
	}

	public boolean isEsya() {
		return isEsya;
	}

	public EvBuilder setEsya(boolean isEsya) {
		this.isEsya = isEsya;
		return this;
	}

	public boolean isHasCocukParki() {
		return hasCocukParki;
	}

	public EvBuilder setHasCocukParki(boolean hasCocukParki) {
		this.hasCocukParki = hasCocukParki;
		return this;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public EvBuilder setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
		return this;
	}

	public boolean isHasOtopark() {
		return hasOtopark;
	}

	public EvBuilder setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
		return this;
	}

	public boolean isHasHavuz() {
		return hasHavuz;
	}

	public EvBuilder setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
		return this;
	}
	
}
