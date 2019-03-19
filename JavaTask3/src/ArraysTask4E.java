import java.util.Arrays;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4E {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array2));

        int sumArray = 0;
        int sumArray2 = 0;
        double avrgArray = 0.0;
        double avrgArray2 = 0.0;

        for (int i = 0; i < 10; i++) {
            sumArray = sumArray + array[i];
            sumArray2 = sumArray2 + array2[i];
        }

        avrgArray = (double) sumArray / 10;
        avrgArray2 = (double) sumArray2 / 10;

        if(avrgArray > avrgArray2){
            System.out.println("Average value of elements in array1 more than in array2, it's " + avrgArray + " VS " + avrgArray2);
        }else if(avrgArray < avrgArray2){
            System.out.println("Average value of elements in array2 more than in array1, it's " + avrgArray2 + " VS " + avrgArray);
        } else {
            System.out.println("Average value of elements in arrays is equal, it's " + avrgArray);
        }

    }
}
