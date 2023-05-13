import java.util.Arrays;

/**
 * BINARY SEARCH HI EKMATR SOLUTION HAI AGAR ARRAY SORTED HAI
 * YA COMPLEXITY log(n) HAI
 */
public class FirstAndLast {

    public static void main(String[] args) {
        int a[]={1,2,2,3,3};
        int target=2;
       System.out.println(Arrays.toString(findOccurence(a, target)));
    }
    static int[] findOccurence(int a[], int target)
    {
        int ans[]={-1,-1};
        ans[0]=isFirst(a, target, true);
        ans[1]=isFirst(a, target, false);
        return ans;
    }
    static int isFirst(int a[],int target, boolean first)
    {
        int s=0,e=a.length-1;
        int mid=0;
        int ans=-1;
        while(s<=e)
        {
            mid=s+(e-s)/2;  
            if(target<a[mid]) 
            e=mid-1;
            else if(target > a[mid])
            s=mid+1;
            else 
            {
                ans=mid;
                // abhi tak hamne sirf dekha ki kya vo element us array me hai ki nahi
                // ab agar us element ke duplicates hain to pointers ko ek ek element shift karte jao
                if(first)
                    {
                        e=mid-1;  
                    }
                else
                        s=mid+1;
            }
        }
        return ans;
    }
}