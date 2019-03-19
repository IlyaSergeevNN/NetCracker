import java.util.Arrays;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4C {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (1 + Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i +=2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));

    }

}
