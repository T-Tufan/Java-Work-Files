package TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar;

import TasarımDesenleri.BridgeDesignPatternLast.Muzik;

public class Spotify implements IMuzikCalar {

    @Override
    public String MuzikCal(Muzik music) {
        System.out.println("Şarkıyı çalacak uygulama : "+this.getAppName());
        System.out.println(music.getAd()+" isimli şarkıyı çalmaya hazırlanıyor.");
        return music.getSes();
    }

    @Override
    public String getAppName() {
        return "Spotify";
    }

}
