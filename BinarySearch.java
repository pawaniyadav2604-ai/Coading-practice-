package arrays;

public class BinarySearch {
    public static int Binarysearch(int arr[], int target){
        int start=0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 12,14,15,16,17,18};
        int target = 14;
        System.out.print("the index is :");
        System.out.print(Binarysearch(arr, target));
    }
}
