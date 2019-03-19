import java.util.Arrays;
import java.util.Collections;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4A {
    public static void main(String[] args) {

        int[] array = new int[50];
        int k = 0;
        for (int i = 1; i < 100; i += 2) {
            array[k] = i;
            k++;
        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
