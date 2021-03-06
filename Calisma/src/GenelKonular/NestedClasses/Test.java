package GenelKonular.NestedClasses;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Nonstatic nonstatic = new Nonstatic();
	Nonstatic.Inner inner = nonstatic.new Inner();
	Nonstatic.Inner2 inner2 = nonstatic.new Inner2();
	System.out.println("Inner sınıfı run metodu \n---------------------");
	inner.run();
	System.out.println("Inner2 sınıfı run metodu\n---------------------");
	inner2.run();
	System.out.println("Nonstatic sınıfı run metodu\n---------------------");
	nonstatic.run();
	System.out.println("Inner3 sınıfı run metodu\n---------------------");
	Static.Inner3 inner3 = new Static.Inner3();
	inner3.run();
	System.out.println("Local sınıfı run metodu\n---------------------");
	Local local = new Local();
	local.run();
	Anonymus anonymus = new Anonymus() {
		public void run() {
			System.out.println("Bu anonymus sınıfına ait run metodudur.");
		}
	};
	anonymus.run();
	}

}
