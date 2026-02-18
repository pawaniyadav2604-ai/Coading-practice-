package arrays;

public class removeduplicate {
    public static int duplicate(int [] arr){
        int remove = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[remove] != arr[i]){
                remove++;
                arr[remove] = arr[i];
            }
        }
        return remove+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,4,4,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" the original array is : " + arr[i]+" ");
        }
        int rd = duplicate(arr);
        System.out.println();
        for (int i = 0; i < rd; i++) {
            System.out.print(" after the removal of duplicate " + arr[i] + " ");
        }
    }
}
