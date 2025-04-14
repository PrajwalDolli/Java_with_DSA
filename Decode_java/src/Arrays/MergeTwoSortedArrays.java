package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={11,33,42,71};
        int[] b={26,54,69,81};
        //int[] c=new int[r]
        int p=a.length;
        int q=b.length;
        int r=p+q;
        int[] c=new int[r];
        int j=0;
        int i=0;
        int k=0;

        for(int t=0;t<r;t++){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;

                k++;
            }
            else if(a[i]>b[j]){
                c[k]=b[j];
                j++;
                k++;
            }
            else if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
            }
        }
//        while(i<j)
    }
}
