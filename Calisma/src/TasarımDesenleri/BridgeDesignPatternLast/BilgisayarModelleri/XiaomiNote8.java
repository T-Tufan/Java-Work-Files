package TasarımDesenleri.BridgeDesignPatternLast.BilgisayarModelleri;

import TasarımDesenleri.BridgeDesignPatternLast.MuzikCalar.IMuzikCalar;
import TasarımDesenleri.BridgeDesignPatternLast.SesBirimi.ISesBirimi;

public class XiaomiNote8 extends TümCihazlar{

    public XiaomiNote8(ISesBirimi iSesBirimi, IMuzikCalar iMuzikCalar) {
        super(iSesBirimi, iMuzikCalar);
    }

    @Override
    public String getBilgisayarModel(String bilgisayarModel) {
        return "Xiaomi Note 8";
    }
}
