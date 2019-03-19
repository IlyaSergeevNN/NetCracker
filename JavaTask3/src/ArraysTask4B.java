/**
 * Created by User on 09.03.2019.
 */
public class ArraysTask4B {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int[] array2 = new int[20];
        for (int i = 0; i < 20; i++) {
            array2[i] = (int) (Math.random() * 11);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int element: array2){
            if(element %2 == 0){
                evenCount ++;
                System.out.print(element + " ");
            }
        }
        System.out.println("Amount of even elements: " + evenCount);

        int oddCount = 0;
        for (int element: array2){
            if(element %2 != 0){
                oddCount ++;
                System.out.print(element + " ");
            }
        }
        System.out.println("Amount of odd elements: " + oddCount);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        // second variant
        startTime = System.nanoTime();
        evenCount = 0;
        oddCount = 0;
        String even = "";
        String odd = "";

        for (int element: array2) {
            if(element %2 == 0){
                evenCount ++;
                even += element + ", ";
            }else {
                oddCount ++;
                odd += element + ", ";
            }
        }
        System.out.println(even + "Amount of even elements: " + evenCount);
        System.out.println(odd + "Amount of odd elements: " + oddCount);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
}
