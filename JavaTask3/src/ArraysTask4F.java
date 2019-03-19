import java.util.Arrays;

/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4F {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3) - 1;
        }
        System.out.println(Arrays.toString(array));

        int count1 = 0;
        int count0 = 0;
        int countMinus1 = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]){
                case -1:
                    countMinus1 ++;
                    break;
                case 0:
                    count0 ++;
                    break;
                case 1:
                    count1 ++;
                    break;
                default:
                    System.out.println("Something goes wrong");
                    break;
            }
        }
        if(count0 > count1 && count0 > countMinus1){
            System.out.println("0");
        }else if(count1 > count0 && count1 > countMinus1){
            System.out.println("1");
        }else if(countMinus1 > count1 && countMinus1 > count0){
            System.out.println("-1");
        }

        if(count0 == count1){
            System.out.println("0, 1");
        }else if(count0 == countMinus1){
            System.out.println("0, -1");
        }else if(count1 == countMinus1){
            System.out.println("1, -1");
        }

    }
}
