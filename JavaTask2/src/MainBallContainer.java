/**
 * Created by Илья on 19.03.2019.
 */
public class MainBallContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(3, 3, 1, 2, 90);
        Container container = new Container(1, 5, 7, 4);

        System.out.println(ball.toString());
        System.out.println(container.collidesWidth(ball));
        ball.move();
        System.out.println(ball.toString());
        System.out.println(container.collidesWidth(ball));

    }


}
