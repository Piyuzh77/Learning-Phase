/**
 * MergeNoSpace
 */
import java.util.*;
public class MergeNoSpace {

    public static void main(String[] args) {
        int a[]={1,3,4,6,7};
        int b[]={2,5,6,9};
        Merge(a, b);
        System.out.println(Arrays.toString(a)+Arrays.toString(b));
    }

    static public void Merge(int a[],int b[])
    {
        int m=b.length;
        int n=a.length;

        int maxLen= Math.max(m, n);
        for(int i=0;i<maxLen;i++)
        {
            if(a[i]>=b[1]){
            int t=a[i];
            a[i]=b[1];
            b[1]=t;
            }
            Arrays.sort(b);     
         }
    }
}