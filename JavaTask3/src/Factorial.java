import java.util.Scanner;

/**
 * Created by User on 09.03.2019.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a n! factorial:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long startTime = System.nanoTime();
        System.out.println("Factorial " + n + " = " + factorialRecursion(n));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        startTime = System.nanoTime();
        System.out.println("Factorial " + n + " = " + factorial(n));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }

    public static long factorialRecursion(long n) {
        long result;
        if (n == 1){
            return 1;
        }
        result = factorialRecursion(n - 1) * n;
        return result;
    }

    public static long factorial(long n){
        long result = 1;
        if(n>1){
            for (int i = 1; i < n ; i++) {
                result = result * (i+1);
            }
        }

        return result;
    }

}
