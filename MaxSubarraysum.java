package arrays;

public class MaxSubarraysum {
    /// // time complexity is O(n^2)
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-1,-2,-3};

        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                 sum = sum+arr[j];
                maxsum = Math.max(sum,maxsum);
            }
        }
        System.out.println("max subarrays : " + maxsum);
    }
}
