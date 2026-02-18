package arrays;

import java.util.Arrays;

class Main {
    public static int[] largest(int arr[]){
        int max = arr[0];
        int min= arr[0];
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
    public static void main(String[] args) {
        int arr[] ={1,3,4,2,8,90,3};
        int result[] = largest(arr);
        System.out.println("largest element is :" + result[0]);
        System.out.println("smallest element is :" + result[1]);
    }
}