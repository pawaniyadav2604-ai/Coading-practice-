package Recursion;

public class BinaryStringProblem {
    public static void printbinarystr(int n , int lastplace, String str){
        //base case
        if (n==0){
            System.out.println(str);
            return;
        }
        //Kaam
        printbinarystr(n-1,0,str+"0");
        if( lastplace==0){
            printbinarystr(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        printbinarystr(3,0, "");
    }
}
