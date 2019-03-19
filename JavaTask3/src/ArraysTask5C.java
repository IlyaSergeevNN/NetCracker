/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask5C {
    public static void main(String[] args) {

        int[][] array = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 21) - 10;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }

        int index = 0;
        int tempMax = 1;
        int max = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                tempMax *= array[i][j];
                }
            if(Math.abs(tempMax) > max){
                max = Math.abs(tempMax);
                index = i;
            }
            tempMax = 1;
        }

        System.out.println(index);
    }
}
