package GenelKonular.Collection;

public class TreeSet {

	public static void main(String[] args) {
		//null kabul etmez.
		//artan bir s�rayla ekleme yap�l�r.K���kten b�y��e s�ralar.
		// TODO Auto-generated method stub
		java.util.TreeSet treeSet = new java.util.TreeSet<>();
		treeSet.add(10);
		
		treeSet.add(1);
		treeSet.add(15);
		try {
			treeSet.add(2);
			treeSet.add(null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		treeSet.forEach(item -> System.out.print(item+" > "));
	}

}
