import java.util.Scanner;

public class CyclicrotationofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // if lenght is not equal it cannot be rotated
        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        // concatinate s1 with itself
        String temp = s1+s1;

        // check if s2 is substring ofs2
        if(temp.contains(s2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        sc.close();

    }
}
