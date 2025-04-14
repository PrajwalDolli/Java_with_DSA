package StringBuilder;

public class ToggleCharacters {
    public static void main(String[] args) {
        String s="Prajwal Dolli";
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
            if(ch>=65&&ch<=90){
                ch=(char)(ch+32);
            }
            else{
                ch=(char)(ch-32);
            }
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
