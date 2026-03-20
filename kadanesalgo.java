package arrays;

public class kadanesalgo {
    public static int kadanes(int arr[]){
        int maxsum= arr[0];
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i] , sum + arr[i]);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2, -3, -1};

        System.out.println(kadanes(arr));
    }

}
