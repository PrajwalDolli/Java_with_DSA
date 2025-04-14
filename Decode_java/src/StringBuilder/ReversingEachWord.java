package StringBuilder;

public class ReversingEachWord {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("I am   Raghav garg");
        int n=sb.length();
        int j=0;
        for(int i=0;i<n;i++){
            if(sb.charAt(i)==' '){
                reversee(j,i-1,sb);
                j=i+1;
            }
        }
        reversee(j,n-1,sb);
        System.out.println(sb);
    }
    public static void reversee(int i,int j,StringBuilder sb){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
