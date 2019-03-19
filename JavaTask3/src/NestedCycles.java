import java.util.Scanner;

/**
 * Created by User on 09.03.2019.
 */
public class NestedCycles {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Task 3a");
        rectangle(n);
        System.out.println("Task 3b-a");
        triangle(n);
        System.out.println("Task 3b-b");
        triangle2(n);
        System.out.println("Task 3b-c");
        triangle3(n);
        System.out.println("Task 3b-d");
        triangle4(n);
    }

    public static void rectangle(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void triangle(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void triangle2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void triangle3(int n){
        int i = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; ++col) {
                while (i < row){
                    System.out.print("  ");
                    i++;
                }

                System.out.print("# ");
            }
            i = 0;
            System.out.println();
        }
        System.out.println();
    }

    public static void triangle4(int n){
        int i = n - 1;
        int k = i;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; ++col) {
                while (k != 0){
                    System.out.print("  ");
                    k--;
                    col++;
                }

                System.out.print("# ");
            }
            i = i - 1;
            k = i;
            System.out.println();
        }
        System.out.println();
    }
}
