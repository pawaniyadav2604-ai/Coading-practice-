package Recursion;

public class Factorial {
    /// /// print factorial of a number
    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = Factorial(n - 1);
        int fn = n * Factorial(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));

    }
}
