package Stringsyoutube;
import java.util.Arrays;
/// //////// method 1 sliding window ///////////


//public class mostFrequentcharacter {
//    public static char getmaxchar(String s) {
//        {
//            int n = s.length();
//            int maxfreq = -1;
//            char ans = s.charAt(0);
//            char[] arr = s.toCharArray();
//            Arrays.sort(arr);
//            int i = 0, j = 0;
//            while (j < n) {
//                if (arr[i] == arr[j]) j++;
//                else {
//                    int freq = j - i;
//                    if (freq > maxfreq) {
//                        maxfreq = freq;
//                        ans = arr[i];
//                    }
//                    i = j;
//                }
//            }
//            int freq = j - i;
//            if (freq > maxfreq) {
//                maxfreq = freq;
//                ans = arr[i];
//
//            }
//            return ans;
//        }
//
//        }
//    public static void main (String[]args){
//        String s = " pawani";
//        System.out.println(getmaxchar(s) );
//    }
//
//}









/// ////////////////method 2 frequency arraay////////////

//public class mostFrequentcharacter {
//    public static char getmax(String s) {
//        int n = s.length();
//        int[] freq = new int[26];
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            int idx = ch - 'a';
//            freq[idx]++;
//        }
//        int maxfreq = 0;
//        char ans = s.charAt(0);
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > maxfreq) {
//                maxfreq = freq[i];
//                ans = (char) (i + 97);
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        String s = "pawani";
//        System.out.println(getmax(s));
//    }
//}



























