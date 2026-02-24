package Recursion;

public class Nnaturallnumbers {
    public static int naatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = naatural(n - 1);
        int print = n + naatural(n - 1);
        return print;
    }
    public static void main(String[] args) {
        int n= 5 ;
        System.out.println(naatural(n));
    }
}
