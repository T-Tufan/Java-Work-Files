package GenelKonular.OOP2;

public class Adres {
	private String EvNo;
	private String Sokak;
	private String Mahalle;
	private String İlçe;
	private String İl;
	private String Ülke;
	
	
	public Adres(String evNo, String sokak, String mahalle, String ilçe, String il, String ülke) {
		super();
		EvNo = evNo;
		Sokak = sokak;
		Mahalle = mahalle;
		İlçe = ilçe;
		İl = il;
		Ülke = ülke;
	}
	public String getEvNo() {
		return EvNo;
	}
	public void setEvNo(String evNo) {
		EvNo = evNo;
	}
	public String getSokak() {
		return Sokak;
	}
	public void setSokak(String sokak) {
		Sokak = sokak;
	}
	public String getMahalle() {
		return Mahalle;
	}
	public void setMahalle(String mahalle) {
		Mahalle = mahalle;
	}
	public String getİlçe() {
		return İlçe;
	}
	public void setİlçe(String ilçe) {
		İlçe = ilçe;
	}
	public String getİl() {
		return İl;
	}
	public void setİl(String il) {
		İl = il;
	}
	public String getÜlke() {
		return Ülke;
	}
	public void setÜlke(String ülke) {
		Ülke = ülke;
	}
	@Override
	public String toString() {
		return "Adres [EvNo=" + EvNo + ", Sokak=" + Sokak + ", Mahalle=" + Mahalle + ", İlçe=" + İlçe + ", İl=" + İl
				+ ", Ülke=" + Ülke + "]";
	}
	
}

