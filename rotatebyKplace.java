package arrays;

public class rotatebyKplace {
    public static void rotatedarray(int[] arr, int k){
        int n = arr.length;
        k= k%n;

        int temp[] = new int[k];
        // for storing first k elements
        for (int i =0 ; i<k; i++){
            temp[i] = arr[i];
        }
      /// /////// shifting remaining elements by k place
        for (int i=k ; i<n ; i++){
            arr[i-k] = arr[i];
        }

        ///  put stored elements in the end
        for (int i = n-k; i <n ; i++) {
            arr[i] = temp[i-(n-k)];
         }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotatedarray(arr,3);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
