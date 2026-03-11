package Recursion;

public class Tilingproblem {
    public static int tiling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical cloumns
        int vertical = tiling(n-1);
        //horizontal columns
        int horizontal = tiling(n-2);
        // total no of ways
        int total = vertical + horizontal;

        return  total;
    }
    public static void main(String[] args) {
        int n= 3;
        System.out.println(tiling(n));
    }
}
