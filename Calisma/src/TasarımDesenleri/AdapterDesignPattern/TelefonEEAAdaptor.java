package TasarımDesenleri.AdapterDesignPattern;

public class TelefonEEAAdaptor implements ElektrikliEvAletleri {
	private ITelefon telefon ;
	
	public TelefonEEAAdaptor(ITelefon telefon) {
		super();
		this.telefon = telefon;
	}

	@Override
	public int prizeTakveCalistir() {
		// TODO Auto-generated method stub
		return telefon.sarjEt();
	}
	

}
