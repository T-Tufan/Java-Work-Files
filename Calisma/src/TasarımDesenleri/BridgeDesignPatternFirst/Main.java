package TasarımDesenleri.BridgeDesignPatternFirst;

public class Main {
    public static void main(String args[]){
        Muzik muzik = new Muzik("Sezen Aksu - Gülümse","Gülümse hadi gülümse...");
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.MuzikCal(muzik);
    }
}
