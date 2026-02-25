package Recursion;

public class ReverseaNumber {
    static  int sum =0;
    public static int reverse(int n ){
        if (n==0) {
            return sum;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;
        return  reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n));
    }
}
