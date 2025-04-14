package StringBuilder;
public class MaxValue {
    public static void main(String[] args) {
        String[] arr = {"45553636336346365345345", "746745","0000000000000001234" };
        String maxS = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max (String a, String b){
        String s = purify(a), t = purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}




//public class MaxValue {
//    public static void main(String[] args) {
//        String[] s={"123","210","543","1111"};
//        int mx=Integer.parseInt(s[0]);
//        for(int i=1;i<s.length;i++){
//            int n=Integer.parseInt(s[i]);
//            mx=Math.max(mx,n);
//        }
//        System.out.println(mx);
//    }
//}
