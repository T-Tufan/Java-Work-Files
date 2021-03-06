package TasarımDesenleri.BridgeDesignPatternLast.BilgisayarModelleri;

import TasarımDesenleri.BridgeDesignPatternLast.Muzik;
import TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar.IMuzikCalar;
import TasarımDesenleri.BridgeDesignPatternLast.SesBirimi.ISesBirimi;

public abstract class TümCihazlar {
    public String bilgisayarModel ;
    protected ISesBirimi iSesBirimi;
    protected IMuzikCalar iMuzikCalar;

    public TümCihazlar() {
    }

    public TümCihazlar(ISesBirimi iSesBirimi, IMuzikCalar iMuzikCalar) {
        System.out.println(getBilgisayarModel(bilgisayarModel)+" açılıyor.");
        this.iSesBirimi = iSesBirimi;
        this.iMuzikCalar = iMuzikCalar;
    }

    public void MuzikCal(Muzik muzik){
        String ses = iMuzikCalar.MuzikCal(muzik);
        iSesBirimi.SesVer(ses);
    }
    public String getBilgisayarModel(String bilgisayarModel){
        return bilgisayarModel;
    }
}
