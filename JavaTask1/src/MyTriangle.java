/**
 * Created by User on 08.03.2019.
 */
public class MyTriangle extends MyPoint {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1.getX() + "," + v1.getY() +
                ", v2=" + v2.getX() + "," + v2.getY() +
                ", v3=" + v3.getX() + "," + v3.getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) return false;
        if (!super.equals(o)) return false;

        MyTriangle that = (MyTriangle) o;

        if (!v1.equals(that.v1)) return false;
        if (!v2.equals(that.v2)) return false;
        return v3.equals(that.v3);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }

    public double getPerimeter(){
        return super.distance(v1, v2) + super.distance(v2, v3) + super.distance(v3, v1);
    }

    public String getType(){
        String type;
        double sideV1V2 = super.distance(v1, v2);
        double sideV2V3 = super.distance(v2, v3);
        double sideV3V1 = super.distance(v3, v1);

        if(sideV1V2 == sideV2V3 && sideV1V2 == sideV3V1){
            type = "Equilateral";
        }else if(sideV1V2 == sideV2V3 || sideV1V2 == sideV3V1 || sideV2V3 == sideV3V1){
            type = "Isosceles";
        }else {
            type = "Scalene";
        }

        return type;
    }
}
