/*
 * rotatedArray
 */
import java.util.*;
public class rotatedArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        rotate(a, 3);
    }
        static public void rotate(int[] nums, int k) {
    
            int a[]= new int[nums.length],j=0;
            for(int i=nums.length-k;i<nums.length;i++)
            {
                a[j]=nums[i];
                j++;
            }
            for(int i=0;i<nums.length-k-1;i++)
            {
                a[j]=a[i];
            }
    
            System.out.println(Arrays.toString(a));
    }
}