package Recursion;

public class fibonaccino {
    public static int fiboncci(int n){
        if (n==0 || n==1){
            return n;
        }

        int fibn1= fiboncci(n-1);
        int fibn2= fiboncci(n-2);
        int fibn= fibn1+fibn2;
        return fibn;
    }
    public static void main(String[] args) {
        int  n= 25;
        System.out.println(fiboncci(n));
    }
}
