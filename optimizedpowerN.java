package Recursion;

public class optimizedpowerN {
    public static void main(String[] args) {
        System.out.println(optimized(5, 2));
        int a= 5;
        int b = 2;
        System.out.println(optimizedPower(a,b));
    }
    /// //first method ./////
    public static int optimized(int x , int n){
        if (n==0){
            return 1;
        }
        int power= optimized(x, n/2);
        if(n % 2 ==0){

            return   power*power;
        }
        else {
            return x * power * power;
        }
    }
///  second method ///////////
    public static int optimizedPower(int a, int b) {

        if (b == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, b / 2);
        if (b % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return a * halfPower * halfPower;
        }
    }
}
