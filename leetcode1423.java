public class leetcode1423 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,1};
       System.out.println (maxScore(a, 3));
    }
        static  public int maxScore(int[] a, int k) {
            int sum=0;
            for(int i=0;i<a.length;i++)
            sum=sum+a[i];
    
            if(k==a.length)
            return sum;
    
            int l=k,r=a.length-1,maxSum=0,wndwSum=0;
                while(l!=0)
            {
                for(int i=r;i>=l;i--)
                {
                wndwSum=wndwSum+a[i];
                }
                maxSum=Math.max(maxSum,wndwSum);
                wndwSum=0;
                l--;r--;
            }
    
            return(sum-maxSum);
        }
    }
