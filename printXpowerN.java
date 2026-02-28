package Recursion;

public class printXpowerN {
    public static void main(String[] args) {
        System.out.println(power(5,5));
    }
    public static int power(int x, int n ){
        if( n == 0){
            return 1;
        }
        int pow = power(x , n-1);
        return  x*pow;
    }
}
