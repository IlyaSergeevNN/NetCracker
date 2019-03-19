import java.util.Arrays;

/**
 * Created by User on 10.03.2019.
 */
public class ArraySwitchIF {
    public static void main(String[] args) {

        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = (int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(array));

        int[] counts = new int[11];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            switch (array[i]){
                case 0:
                    System.out.print(0 + ", ");
                    counts[0] ++;
                    break;
                case 1:
                    System.out.print(1 + ", ");
                    counts[1] ++;
                    break;
                case 2:
                    System.out.print(2 + ", ");
                    counts[2] ++;
                    break;
                case 3:
                    System.out.print(3 + ", ");
                    counts[3] ++;
                    break;
                case 4:
                    System.out.print(4 + ", ");
                    counts[4] ++;
                    break;
                case 5:
                    System.out.print(5 + ", ");
                    counts[5] ++;
                    break;
                case 6:
                    System.out.print(6 + ", ");
                    counts[6] ++;
                    break;
                case 7:
                    System.out.print(7 + ", ");
                    counts[7] ++;
                    break;
                case 8:
                    System.out.print(8 + ", ");
                    counts[8] ++;
                    break;
                case 9:
                    System.out.print(9 + ", ");
                    counts[9] ++;
                    break;
                case 10:
                    System.out.print(10 + ", ");
                    counts[10] ++;
                    break;

            }
        }
        System.out.println();

        for (int i = 0; i < counts.length; i++) {
            System.out.print("Amount of " + i + " = " + counts[i] + ", ");
        }
        System.out.println();

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        System.out.println();

        startTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                System.out.print(0 + ", ");
                counts[0] ++;
            }else if(array[i] == 1){
                System.out.print(1 + ", ");
                counts[1] ++;
            }else if(array[i] == 2){
                System.out.print(2 + ", ");
                counts[2] ++;
            }else if(array[i] == 3){
                System.out.print(3 + ", ");
                counts[3] ++;
            }else if(array[i] == 4){
                System.out.print(4 + ", ");
                counts[4] ++;
            }else if(array[i] == 5){
                System.out.print(5 + ", ");
                counts[5] ++;
            }else if(array[i] == 6){
                System.out.print(6 + ", ");
                counts[6] ++;
            }else if(array[i] == 7){
                System.out.print(7 + ", ");
                counts[7] ++;
            }else if(array[i] == 8){
                System.out.print(8 + ", ");
                counts[8] ++;
            }else if(array[i] == 9){
                System.out.print(9 + ", ");
                counts[9] ++;
            }else if(array[i] == 10){
                System.out.print(10 + ", ");
                counts[10] ++;
            }
        }
        System.out.println();

        for (int i = 0; i < counts.length; i++) {
            System.out.print("Amount of " + i + " = " + counts[i] + ", ");
        }
        System.out.println();

        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);


    }
}
