package Stringss;
import java.util.Scanner;
public class countingVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String");
        String s=sc.nextLine();
        int n=s.length();
        int count=0;
        //char ch=charAt(i)
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='A')
            return true;
        else if(ch=='e'||ch=='E')
            return true;
        else if(ch=='i'||ch=='I')
            return true;
        else if(ch=='o'||ch=='O')
            return true;
        else if(ch=='u'||ch=='U')
            return true;
        else
            return false;
    }
}
