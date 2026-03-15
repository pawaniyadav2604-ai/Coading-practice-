package Recursion;

public class removeduplicates {
    public static void removedup(String str , int idx, StringBuilder newstr,boolean map[]){
        if(idx== str.length()){
            System.out.println(newstr);
            return;
        }

        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a'] == true){
            //duplicate
            removedup(str,idx+1,newstr,map);
        }
        else {
            map[currentchar-'a']= true;
            removedup(str, idx+1,newstr.append(currentchar),map);
        }
    }
    public static void main(String[] args) {
          String str ="aaaabbbbcccdddeeeefffff";
          removedup(str,0,new StringBuilder(""),new boolean[26]);
    }
}
