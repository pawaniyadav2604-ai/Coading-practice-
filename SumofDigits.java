package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(1324));
    }
    public static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        int remainder= n%10;
        int sumremainder = sumofdigits(n/10) + remainder;
        return sumremainder;
    }
}
