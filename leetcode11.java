public class leetcode11 {
    public static void main(String[] args) {
        int[] a={1,3,2,5,25,24,4};
       System.out.println(maxArea(a));
    }

       static public int maxArea(int[] a) {
             int l=0,r=a.length-1;
             int maxStrg=Integer.MIN_VALUE;
                 for(int i=l;i<=r;i++)
             {
                int currStrg=Math.min(a[l],a[r])*(r-l);
                maxStrg=Math.max(currStrg,maxStrg);
                if(a[l]>a[r])
                r--;
                else if(a[l]<a[r])
                l++;
                else if(a[l]==a[r])
                {
                   l++; 
                }
             }
    
             return maxStrg;
        }
    }
