package Recursion;

public class FriendsPairingProblem {
    public static int pairs(int n){
        if(n==1||n==2){
            return n;
        }
        int single = pairs(n-1);
        int pairs = pairs(n-2);
        int choices = (n-1) * pairs;
        int total = single + choices;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(pairs(4));

     }
}
