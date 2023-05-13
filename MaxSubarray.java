/*find the sub array with the max sum
 * to do this- declare a variable maxSum with least integer value
 * now go on every element and add it with every other element in the array
 * store the sum in a variable say currSum
 * compare currSum and maxSum
 * replace the value of maxSum with the above comparison
 * this max sum will be the maximum value of the concurring element of the array;
 * -end-
 */

class MaxSubarray {
    public static void main(String[] args) {
        int[] a= {1,2,3,-3,4,5,6,6,-7,7,7,-99};
        System.out.println(maxSubArray(a));
    }
        static public int maxSubArray(int[] nums) {
           int currSum=0, maxSum=0;
           for(int i=0;i<nums.length;i++)
           {
               if(currSum<0) currSum=0;
               currSum+=nums[i];
               maxSum=Math.max(currSum,maxSum);
           }
             return maxSum;
        }
    }

