package arrays;

class evenoddnumber{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int evencount=0;
        int oddcount=0;

        for(int i= 0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                evencount++;
            }
            else{
                oddcount++;
            }


        }

        int even[]= new int[evencount];
        int odd[]=new int[oddcount];

        int e=0,o=0;

        for(int i=0; i<arr.length ; i++){
            if (arr[i] % 2 ==0){
                even[e++] = arr[i];
            }
            else{
                odd[o++] = arr[i];
            }
        }

        System.out.print("even numbers:");
        for (int i=0; i<even.length; i++){
            System.out.println(even[i]+" ");
        }
        System.out.print("odd numbers:");
        for (int i= 0; i<odd.length; i++){
            System.out.println(odd[i]+" ");
        }
    }
}
