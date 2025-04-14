package StringBuilder;

public class ReverseWithoutBuiltIn {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Prajwal dolli");
        int i=0;
        int n=sb.length();
        int j=n-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
