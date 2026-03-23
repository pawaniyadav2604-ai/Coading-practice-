package Recursion;

public class TowerofHanoi {

    public static void toh(int n, char src, char helper, char dest) {
        // base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // step 1: move n-1 disks from src → helper
        toh(n - 1, src, dest, helper);

        // step 2: move nth disk
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // step 3: move n-1 disks from helper → dest
        toh(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        toh(n, 'A', 'B', 'C');
    }
}