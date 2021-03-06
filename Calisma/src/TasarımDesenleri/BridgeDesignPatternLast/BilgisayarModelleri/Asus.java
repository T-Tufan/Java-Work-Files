package TasarımDesenleri.BridgeDesignPatternLast.BilgisayarModelleri;


import TasarımDesenleri.BridgeDesignPatternLast.Muzik;
import TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar.IMuzikCalar;
import TasarımDesenleri.BridgeDesignPatternLast.SesBirimi.ISesBirimi;

public class Asus extends TümCihazlar {

    public Asus(ISesBirimi iSesBirimi, IMuzikCalar iMuzikCalar) {
        super(iSesBirimi, iMuzikCalar);
    }

    @Override
    public void MuzikCal(Muzik muzik) {
        super.MuzikCal(muzik);
    }

    @Override
    public String getBilgisayarModel(String bilgisayarModel) {
        return "Asus";
    }
}
