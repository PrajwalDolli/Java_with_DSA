package StringBuilder;

public class DeleteAndInsert {
    public static void main(String[] args) {
         StringBuilder sb=new StringBuilder("abcxyz");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(2,'A');
        sb.insert(2,26);
        sb.insert(2,true);
        sb.insert(2,"ABC");
        System.out.println(sb);

    }
}
