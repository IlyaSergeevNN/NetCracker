import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysSort {
    public static void main(String[] args) {
        System.out.println("Enter a number of elements of the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array));

        long startTime = System.nanoTime();
        sortUpBubble(array);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        System.out.println(Arrays.toString(array));

        startTime = System.nanoTime();
        selectionSort(array);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        System.out.println(Arrays.toString(array));

        startTime = System.nanoTime();
        Arrays.sort(array);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
        System.out.println(Arrays.toString(array));

    }

    public static void sortUpBubble(int[] array){

        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(array[j] > array[j+1]){
                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}
