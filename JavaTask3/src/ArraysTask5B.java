/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask5B {
    public static void main(String[] args) {

        int[][] array = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 199) - 99;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        int indexX = 0;
        int indexY = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }

        System.out.println("Maximum element = " + max + ", coordinates: " + indexX + ", " + indexY );


    }
}
