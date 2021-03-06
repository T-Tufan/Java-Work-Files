package TasarımDesenleri.BridgeDesignPatternLast.SesBirimi;

public class Kulaklık implements ISesBirimi{
    @Override
    public void SesVer(String ses) {
        System.out.println("Müzik "+getSesAygıtı()+" aygıtından verilecek.");
        System.out.println(ses);
    }

    @Override
    public String getSesAygıtı() {
        return "QCY T5 Kulaklık";
    }
}
