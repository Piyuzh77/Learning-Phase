public class leetcode540 {

    public static void main(String[] args) {
        int[] a={3,3,4,5,5,7,7,9,9,10,10};
        System.out.println(singleSequence(a));
    }
    static int singleSequence(int[] a)
    {
        int s=0,e=a.length-1;
        int mid;
        while(s<e)
        {
            mid=s+(e-s)/2;

            if(mid%2==1)
            mid--;

            if(a[mid]==a[mid+1])
            s=mid+2;

            else
            e=mid;
        }
        return a[e];
    }
}