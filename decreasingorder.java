package Recursion;

public class decreasingorder {
    /// // print numbers from n 10 1 in decreasing order
    public static void decorder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decorder(n - 1);
    }

    /// ////// print numbers from 1to n in ascending order
    public static void increasingorder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasingorder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        increasingorder(5);
        decorder(5);
    }
}
