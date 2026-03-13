///// ///////////////////////  Spiral Matrix /////////////////////////////////////
//
//public class twodimensionalarray {
//
//    public static void spiralmatrix(int matrix[][]){
//        int startrow = 0;
//        int startcol = 0;
//        int endrow = matrix.length -1;
//        int endcol = matrix[0].length -1;
//
//        while ( startrow <= endrow && startcol<= endcol ){
//            // for printing top
//            for (int j = startcol; j <= endcol; j++) {
//                System.out.print(matrix[startrow][j] + " ");
//            }
//
//            // for printing right side
//            for (int i = startrow; i <=endrow ; i++) {
//                System.out.print(matrix[i][endcol] + " ");
//            }
//
//            // for printing bottom side
//            for (int j = endcol-1; j >=startcol; j--) {
//                if (startrow == endrow){
//                    break;
//                }
//                System.out.print(matrix[endrow][j] + " ");
//            }
//
//            // for printing left side
//            for (int i = endrow-1; i >=startcol; i--) {
//                if (startcol == endcol){
//                    break;
//                }
//                System.out.print(matrix[i][startcol] + " ");
//            }
//            startcol++;
//            startrow++;
//            endcol--;
//            endrow--;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//       int matrix[][] = {{1,2,3,4},
//               {5,6,7,8},
//               {9,10,11,12},
//               {13,14,15,16} };
//       spiralmatrix(matrix);
//    }
//}

/// ///////////////////// Diagonal Sum Question ////////////////////

//public class twodimensionalarray {
//
//    public static int diagonalsum(int matrix[][]){
//
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                } else if (i+j == matrix.length-1) {
//                    sum += matrix[i][j];
//                }
//            }
//        }
//          return sum;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][] = {{1,2,3,4},
//              {5,6,7,8},
//              {9,10,101,12},
//               {13,14,15,16} };
//        System.out.println(diagonalsum(matrix));
//    }
//}


/// //////////// add two sum leetcode question ////////////////////////////////

//public class twodimensionalarray {
//    public int[] twosum(int[] nums, int target){
//        int[] arr = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//                if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                    break;
//                }
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int nums[] = {2, 7, 11, 15};
//        int target = 9;
//
//        twodimensionalarray obj = new twodimensionalarray();
//        int[] result = obj.twosum(nums, target);
//
//        System.out.println(Arrays.toString(result));



    /// /////////// diagonal sum //////////////////////

//public class twodimensionalarray {
//    public  static int diagonalsum(int matrix[][]){
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            // condition for primary diagonal
//            sum += matrix[i][i];
//
//            // condition for secondary diagonal
//            if (i != matrix.length-1-i)
//            sum += matrix[i][matrix.length-i-1];
//
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16} };
//        System.out.println(diagonalsum(matrix));
//    }
//}


/// /////////// search in sorted matrix code ----  Staircase problem /////////////////////////////////////////

//public class twodimensionalarray {
//    public static boolean staircasesearch( int matrix[][], int key){
//        int row = 0, col = matrix[0].length-1;
//
//        while(row< matrix.length && col >=0) {
//            if (matrix[row][col] == key) {
//                System.out.println("found the key at (" + row + "," + col + ")");
//                return true;
//            } else if (key < matrix[row][col]) {
//                col--;
//            } else {
//                row++;
//            }
//
//        }
//        System.out.println("key not found!");
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int matrix[][] = { {10,20,30,40} ,
//                {15,25,35,45} ,
//                {27,29,39,48} ,
//                { 32,33,39,50}};
//        int key = 33;
//        staircasesearch(matrix,key);
//    }
//}




//public class twodimensionalarray{
//    public static int linearsearch(int numbers[] , int key){
//        for (int i = 0; i<= numbers.length; i++){
//            if ( numbers[i] == key){
//                return i;
//            }
//
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers[] = {1,2,3,43,5,6,6,7};
//        int key = 43;
//
//        int index =  linearsearch(numbers,key);
//        if(index == -1){
//            System.out.print("key not found");
//        }
//        else{
//            System.out.print("key found at index :" + index);
//        }
//
//    }
//}




/// /////////////// reverse an array /////////////////

//public class twodimensionalarray {
//    public static  int reverseanarray(int array[]) {
//        int i = 0;
//        int j = array.length - 1;
//
//        while (i < j) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//            i++;
//            j--;
//        }
//        return i++;
//    }
//    public static void main(String[] args) {
//        int array[] = {1,2,3,4,5,6,7,8,9};
//        reverseanarray(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print( array[i] +  " ");
//        }
//        System.out.println();
//    }
//}




/// ////////////////// Remove duplicatre values from array //////////////////

//public class twodimensionalarray {
//    static int duplicate(int array[]) {
//        int rd = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[rd] != array[i]) {
//                rd++;
//                array[rd] = array[i];
//            }
//        }
//        return rd+1;
//    }
//      public static void main (String[] args){
//            int array[] ={2, 3, 4, 4, 5, 6, 6, 8, 8, 9, 2, 2};
//          for (int i = 0; i < array.length; i++) {
//              System.out.print(array[i] + " ");
//          }
//            int rd =duplicate(array);
//          System.out.println();
//            for (int i = 0; i < rd; i++) {
//                System.out.print(array[i] + " ");
//            }
//        }
//    }



/// ////////// 2D array solutions //////////////////



//public class twodimensionalarray {
//    public static void main(String[] args) {
//        int arr[][] = {{4, 8, 8}, {1,2,1}, {9, 4, 5}};
//
//        int count7 = 0;
//        for (int i = 0; i < arr[0].length; i++) {
//            count7 += arr[1][i];
//        }
//        System.out.println("sum is :" + count7);
//    }
//}




///  ///// /////////////////// Transpose of a matrix///////////////////////////////
import java.util.*;
public class twodimensionalarray {
        int arr[][] = new int[3][3];   // instance variable

        // Method to input matrix values
        void getData() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter elements of 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt(); // input values into arr
                }
            }

            }
    /// / for output of data
    void putData () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }


        }
    void transpose () {
        System.out.println(" transpose is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        twodimensionalarray obj = new twodimensionalarray();
        obj.getData();
        obj.putData();
        obj.transpose();
    }
}







