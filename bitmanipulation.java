package Stringsyoutube;
/// /////////// to find odd aur even number ////////////////////////
//public class bitmanipulation {
//    public static void   oddoreven(int n ){
//        int bitmask = 1;
//        if ((n & bitmask)==0){
//            System.out.println(" even number ");
//        }
//        else{
//            System.out.println(" odd number ");
//        }
//    }
//
//    public static void main(String[] args) {
//        oddoreven(3);
//    }
//}




//public class bitmanipulation {
//    public static int clearithbit(int n, int i) {
//        int bitmask = ~(1 << i);
//        return n & bitmask;
//    }
//
//    public static int setithbit(int n, int i) {
//        int bitmask = 1 << i;
//        return n | bitmask;
//    }
//
//    public static int updateithbit(int n, int i, int newbit) {
//        n = clearithbit(n, i);
//        int bitmask = newbit << i;
//        return n | bitmask;
//    }
//
//    public static int clearbit(int n, int i) {
//        int bitmask = (~0) << i;
//        return n & bitmask;
//    }
//
//    public static int clearIbit(int n, int i, int j) {
//        int a = (~0) << j + 1;
//        int b = (1 << i) - 1;
//        int bitmask = a | b;
//        return n & bitmask;
//    }
//
//    public static int countsetbits(int n) {
//        int count = 0;
//        while (n > 0) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//    String ch="rtyuiknbgyuj";
//        System.out.println(ch);
//    }
//}


public class bitmanipulation{
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for(char ch='A';ch<='Z';ch++) {
            System.out.println((char) (ch|' '));
            // prints abcdefghijklmnopqrstuvwxyz
            }
    }
}
