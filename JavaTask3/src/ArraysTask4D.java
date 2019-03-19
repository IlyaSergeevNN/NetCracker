import java.util.Arrays;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4D {
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = (int) (Math.random() * 101) - 50;
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        int minLastIndex = 0;
        int maxLastIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] <= min){
                min = array[i];
                minLastIndex = i;
            }else if (array[i] >= max){
                max = array[i];
                maxLastIndex = i;
            }
        }
        System.out.println("Minimum element = " + min + ", it's last index is: " + minLastIndex);
        System.out.println("Maximum element = " + max + ", it's last index is: " + maxLastIndex);
    }
}
