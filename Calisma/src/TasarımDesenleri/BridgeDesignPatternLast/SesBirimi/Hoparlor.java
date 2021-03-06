package TasarımDesenleri.BridgeDesignPatternLast.SesBirimi;

public class Hoparlor implements ISesBirimi{
    @Override
    public void SesVer(String ses) {
        System.out.println("Müzik "+getSesAygıtı()+" aygıtından verilecek.");
        System.out.println(ses);
    }

    @Override
    public String getSesAygıtı() {
        return "Hoparlör";
    }
}
