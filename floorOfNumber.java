/**
 * floorOfNumber
 */
public class floorOfNumber {

    public static void main(String[] args) {
        int a[]={1,3,5,14,22,37,54,77,99,110},target=2;
        System.out.println(binarysearch(a,target)); 
    }
    static int binarysearch(int a[], int target)
    {
        int s=0,e=a.length-1;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2; 
            if(target<a[mid]) 
            e=mid-1;
            else if(target > a[mid])
            s=mid+1;
            else {
            return a[mid];
            }

        }
        return  a[e];
    }
}
