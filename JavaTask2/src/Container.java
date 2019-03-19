/**
 * Created by Илья on 19.03.2019.
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public boolean collidesWidth(Ball ball){
        if(ball.getX() + ball.getRadius() <= this.getX2() &&
                ball.getX() - ball.getRadius() >= this.getX1() &&
                ball.getY() + ball.getRadius() <= this.getY1() &&
                ball.getY() - ball.getRadius() >= this.getY2()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Container{" +
                '(' + x1 + ", " + y1 + ')' +
                '(' + x2 + ", " + y2 + ')' +
                 + '}';
    }
}
