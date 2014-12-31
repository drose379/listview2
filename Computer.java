package dylanrose60.listview2;

import android.graphics.drawable.Drawable;

public class Computer {

    protected String Model;
    protected String OS;
    protected int ImgRes;


    public Computer(String model,String os,int img) {
        this.Model = model;
        this.OS = os;
        this.ImgRes = img;
    }

    public String getModel() {
        return Model;
    }

    public String getOS() {
        return OS;
    }

    public int  getImg() {return ImgRes; }


}
