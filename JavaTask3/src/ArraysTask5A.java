/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask5A {
    public static void main(String[] args) {

        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }

            System.out.println();
        }

        long sumMain = 0;
        long productMain = 1;
        long sumSecondary = 0;
        long productSecondary = 1;

        for (int i = 0; i < array.length; i++) {
            sumMain += array[i][i];
            productMain *= array[i][i];
        }
        System.out.println("Sum of main diagonal = " + sumMain + ", product = " + productMain);

        for (int i = 0, j = 7; i < array.length; i++, j--) {
            sumSecondary += array[i][j];
            productSecondary *= array[i][j];
        }
        System.out.println("Sum of secondary diagonal = " + sumSecondary + ", product = " + productSecondary);



        }
}

