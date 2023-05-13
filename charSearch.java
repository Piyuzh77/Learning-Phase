/**
 * charSearch
 */
public class charSearch {
public static void main(String[] args) {
    char a[]={'c','f','j'};
    char target='f';
    System.out.println(binarysearch(a,target)); 
}
static char binarysearch(char a[], char target)
    {
        int s=0,e=a.length-1;
        int mid=0;
        while(s<=e)
        {
            mid=s+(e-s)/2; 
            if(target<a[mid]) 
            e=mid-1;
            else 
            s=mid+1;
        }
    return  a[s%(a.length)];
    }
}
