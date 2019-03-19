/**
 * Created by User on 08.03.2019.
 */
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] array = {x, y};
        return array;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;

        MyPoint myPoint = (MyPoint) o;

        if (getX() != myPoint.getX()) return false;
        return getY() == myPoint.getY();

    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

    public double distance(int x, int y){
        return Math.sqrt( (this.getX() - x)*(this.getX() - x) + (this.getY() - y)*(this.getY() - y) );
    }

    public double distance(MyPoint another){
        return Math.sqrt( (this.getX() - another.getX())*(this.getX() - another.getX()) + (this.getY() - another.getY())*(this.getY() - another.getY()) );
    }

    public double distance(MyPoint myPoint1, MyPoint myPoint2){
        return Math.sqrt( (myPoint1.getX() - myPoint2.getX())*(myPoint1.getX() - myPoint2.getX()) + (myPoint1.getY() - myPoint2.getY())*(myPoint1.getY() - myPoint2.getY()) );
    }

    public double distance(){
        return Math.sqrt( this.getX()*this.getX() + this.getY()*this.getY() );
    }
}
