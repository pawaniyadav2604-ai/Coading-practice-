package arrays;

public class sortedarray {
    public static boolean sortedarray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 8, 5};
        boolean result= sortedarray(arr);
       if(result){
           System.out.println("array is sorted ");
       }else {
           System.out.println("array is not sorted ");
       }
    }
}
