/**
 * Calculates the factorial of a given non-negative integer.
 * @param n The non-negative integer for which to calculate the factorial.
 * @return The factorial of n.
 * Factorial of 0 is 1 by definition
 * Factorial of n is n multiplied by factorial of (n-1)
 * Print the factorial of the entered number
 */
import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}
