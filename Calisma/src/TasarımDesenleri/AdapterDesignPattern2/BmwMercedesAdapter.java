package TasarımDesenleri.AdapterDesignPattern2;

public class BmwMercedesAdapter extends Mercedes{
	private BMW bmw;
	
	 public BmwMercedesAdapter(BMW bmw) {
		// TODO Auto-generated constructor stub
		super();
		this.bmw = bmw;
	}
	@Override
	public boolean OzelUretimMi() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int ArabaSat() {
		// TODO Auto-generated method stub
		return bmw.ArabaSat();
	}

}
