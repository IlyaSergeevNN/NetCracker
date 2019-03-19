/**
 * Created by User on 11.03.2019.
 */
public class MyComplex {

    private double real;
    private double img;

    public MyComplex(){
        this(0.0, 0.0);
    }

    public MyComplex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }

//    public boolean isReal(){
//        return Math.abs(img) < EPS;;
//    }

    public boolean isImaginary(){
        return false;
    }


}
