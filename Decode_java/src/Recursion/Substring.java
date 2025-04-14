package Recursion;
import java.util.*;
public class Substring {
    static ArrayList<String> arr=new ArrayList<>();
    public static void printSubstring(int i,String str,String ans){
        if(i==str.length()){
            arr.add(ans);
            //System.out.println(ans);
            return;
        }

        char ch=str.charAt(i);
        //if u want in reverse order then swap the calling functions
        printSubstring(i+1,str,ans+ch);
        printSubstring(i+1,str,ans);

    }
    public static void main(String[] args) {
        String str="abc";
        arr=new ArrayList<>();//reset
        printSubstring(0,str,"");
        System.out.println(arr);
    }
}
