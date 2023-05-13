class Solution {
    static int pivotIndex(int[] nums) {
        
        int sumLeft=0,sumRight=0;
        int i=1;
        while(i<nums.length-1)
        {
            sumLeft=sumLeft+nums[i-1];
            sumRight=sumRight+nums[i+1];
            if(sumLeft==sumRight)
            return i;
            i++;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] a= {2,1,-1,0,9};
        System.out.println(pivotIndex(a));
    }
}