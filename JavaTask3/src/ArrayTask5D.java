import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by User on 09.03.2019.
 */
public class ArrayTask5D {
    public static void main(String[] args) {
        int[][] array = new int[10][7];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();

        Integer[] tempArray = new Integer[7];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                tempArray[j] = array[i][j];
            }
            Arrays.sort(tempArray, Collections.reverseOrder());

            for (int j = 0; j < 7; j++) {
                array[i][j] = tempArray[j];
            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
