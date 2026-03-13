package Stringsyoutube;

import java.util.*;
public class anagram {
    public static  boolean areAnagrams(String s1, String s2){
        if (s1.length() != s2.length())return false;
        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i =0 ;i< arr2.length; i++){
            if (arr1[i] != arr2[i]) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
