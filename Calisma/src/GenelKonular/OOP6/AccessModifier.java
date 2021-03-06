package GenelKonular.OOP6;

public class AccessModifier {
    private int enginePower,model;
    public int speed;
    protected  String color;

    AccessModifier(){
        this.model = 2015;
        this.enginePower = 450;
        this.speed = 320;
        this.color = "dark blue";
    }

    public String print() {
        return "AccessModifier{" +
                "enginePower=" + enginePower +
                ", model=" + model +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
