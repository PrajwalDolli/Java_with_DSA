package StringBuilder;
import java.util.Scanner;
public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //in java characters are implicitly converted into int in arithmetic operation
            int idx=ch-97;
            freq[idx]++;
//            arr[ch-97]++;
        }
        int maxFreq=-1;
        for(int i=0;i<freq.length;i++){
            maxFreq=Math.max(maxFreq,freq[i]);
        }
        for(int i=0;i<freq.length;i++){
            if(maxFreq==freq[i]){
                char ch=(char)(i+97);
                System.out.println(ch);
            }
        }
    }
}
