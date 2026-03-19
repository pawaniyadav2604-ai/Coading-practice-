package arrays;

public class printsubarrays {
    public static int subarrays(int [] arr){
        for (int i = 0; i <= arr.length; i++) {
            for(int j= i; j<= arr.length ; j++){
                for(int k = i ; k<j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        System.out.println(subarrays(arr));
    }
}
