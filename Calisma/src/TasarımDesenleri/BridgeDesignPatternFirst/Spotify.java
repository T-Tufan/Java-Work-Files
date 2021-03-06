package TasarımDesenleri.BridgeDesignPatternFirst;

public class Spotify {
    public String MuzikCal(Muzik muzik){
        System.out.println("Spotify " + muzik.getAd()+" şarkısını çalıyor.");
        return muzik.getSes();
    }
}
