package Recursion;

public class SkipCharacter {
    public static void skip(int i, String str, String s) {

        if (i == str.length()) {
            System.out.println(s);
            return;

        }
//        method 2
//        if (str.charAt(i) != 'a') {
//            skip(i+1,str,s+str.charAt(i));
//        }
//        else{
//            skip(i+1,str,s);
//        }



        if (str.charAt(i) != 'a') {
            s += str.charAt(i);
        }

        skip(i + 1, str, s);
    }

    public static void main(String[] args) {
        String str = "Prajwal pajja";
        String s="";
        skip(0, str, s);
    }
}