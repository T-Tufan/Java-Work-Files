package GenelKonular.OOP2;

import java.util.ArrayList;

public class Student {
	private String isim;
	private String okulNo;
	private int tel;
	private Adres adres;
	private Okul okul;
	private ArrayList<Dersler> dersler;

	public Student(String isim, String okulNo, int tel, Adres adres, Okul okul, ArrayList<Dersler> dersler) {
		super();
		this.isim = isim;
		this.okulNo = okulNo;
		this.tel = tel;
		this.adres = adres;
		this.okul = okul;
		this.dersler = dersler;
	}
	public Student(String isim,String okulNo) {
		super();
		this.isim = isim;
		this.okulNo = okulNo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public Okul getOkul() {
		return okul;
	}
	public void setOkul(Okul okul) {
		this.okul = okul;
	}
	public ArrayList<Dersler> getDersler() {
		return dersler;
	}
	public void setDersler(ArrayList<Dersler> dersler) {
		this.dersler = dersler;
	}
	@Override
	public String toString() {
		return "Student [isim=" + isim + ", okulNo=" + okulNo + ", tel=" + tel + ", adres=" + adres.toString() + ", okul=" + okul.toString()
				+ ", dersler=" + dersler.toString() + "]";
	}
	
	public void threadMetot(String jobs) {
		for(int i =0 ; i<100;i++) {
			System.out.println(jobs+" : "+i);
		}
	}
}
