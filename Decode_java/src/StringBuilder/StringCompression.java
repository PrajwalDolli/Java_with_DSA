package StringBuilder;
        public class StringCompression {
            public static void main(String[] args) {
                String s = "aaaagggeeeccuuudehh"; // Corrected the string
                char[] arr = s.toCharArray();
                String ans = "";
                int i = 0, j = 0;
                while (j < arr.length) {
                    if (arr[j] == arr[i])
                        j++;
                    else {
                        ans += arr[i];
                        int len = j - i;
                        if (len > 1)
                            ans += len;
                        i = j; // Corrected: i should be updated to j
                    }
                }
                ans += arr[i]; // Added: handle the last character
                int len = j - i;
                if (len > 1)
                    ans += len;
                System.out.println(ans);
            }
        }


//BY ME

//public class CompressString {
//    public static void main(String[] args) {
//        String s="aaaabbcaaddeff";
//        String ans="";
//        int i=0;
//        int j=0;
//        for(j=0;j<s.length();j++){
//            char ch=s.charAt(i);
//            if(ch!=s.charAt(j)){
//                int l=j-i;
//                ans=ans+s.charAt(i);
//                if(l>1){
//                    ans+=l;
//                }
//                i=j;
//            }
//        }
//        ans=ans+s.charAt(i);
//        int l=j-i;
//        if(l>1){
//            ans+=l;
//        }
//        System.out.println(ans);
//    }
//}
