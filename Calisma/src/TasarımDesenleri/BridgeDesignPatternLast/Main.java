package TasarımDesenleri.BridgeDesignPatternLast;

import TasarımDesenleri.BridgeDesignPatternLast.BilgisayarModelleri.Asus;
import TasarımDesenleri.BridgeDesignPatternLast.BilgisayarModelleri.XiaomiNote8;
import TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar.Fizy;
import TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar.Spotify;
import TasarımDesenleri.BridgeDesignPatternLast.SesBirimi.Hoparlor;
import TasarımDesenleri.BridgeDesignPatternLast.SesBirimi.Kulaklık;

public class Main {
    public static void main(String args[]){
        Muzik muzik = new Muzik("Ahmet Kaya -Dardayım","Dardayım yalanım yok.Baskın yedim ...");

        System.out.println("---------Asus bilgisayar------------");
        Asus asus = new Asus(new Kulaklık(),new Fizy());
        System.out.println(asus);
        asus.MuzikCal(muzik);
        System.out.println();
        System.out.println("---------Xiaomi Note 8 telefon------------");
        XiaomiNote8 xiaomiNote8 = new XiaomiNote8(new Hoparlor(),new Spotify());
        xiaomiNote8.MuzikCal(muzik);
    }
}
