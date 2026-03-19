package arrays;

public class reverseanarray {
    public static int reverse(int [] arr){
        int first = 0;
        int last = arr.length-1;

        for (int i = first; i <last; i++) {
            int temp = arr[last];
            arr[last] =arr[first];
            arr[first] =temp;
            first++;
            last--;
        }
        return arr[last];
    }
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
