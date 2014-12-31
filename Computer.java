package dylanrose60.listview2;

public class Computer {

    protected String Model;
    protected String OS;


    public Computer(String model,String os) {
        this.Model = model;
        this.OS = os;
    }

    public String getModel() {
        return Model;
    }

    public String getOS() {
        return OS;
    }
}
