/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int a[]={-11,3,5,14,22,37,54,77,99,110},target=99 ;
        System.out.println(binarysearch(a,target));
        System.out.println(BinarySearchRec(a,target,0,a.length-1)); 
    }
    static int binarysearch(int a[], int target)
    {
        int s=0,e=a.length-1;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2; //mid= 4 
            if(target<a[mid]) //false
            e=mid-1;//
            else if(target > a[mid])//true
            s=mid+1;
            else {
            return mid;
            }
// checking git
        }
        return -1;
    }


    static int BinarySearchRec(int[] a, int target, int s,int e)
    {
        if(s>e)
        return -1;
        int m=s+(e-s)/2;
        if(a[m]==target)
        return m;
        if(target<a[m])
        return BinarySearchRec(a, target, s, m-1);
        else
        return BinarySearchRec(a, target, m+1, e);
    }
    
}