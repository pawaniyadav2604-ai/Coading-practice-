package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n = 1209080;
        System.out.println(countzero(n));
    }

    public static int countzero(int n) {
        if(n==0){
            return 0;
        }
        int count = (n % 10 == 0)?1:0;// terninary operator for true air false
        return  count+countzero(n/10);
    }
}
