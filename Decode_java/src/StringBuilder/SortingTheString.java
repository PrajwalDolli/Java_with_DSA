package StringBuilder;
import java.util.Arrays;
public class SortingTheString {
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("prajwal");
        char[] ch1=sb.toString().toCharArray();
        Arrays.sort(ch1);
        for(char ele:ch1){
            System.out.print(ele);
        }
        System.out.println();
        String[] s={"shreyas","sumanth","ravi"};
        Arrays.sort(s);
        for(String ele:s){
            System.out.println(ele);
        }
    }
}
