package recursion;

import java.util.Arrays;

public class RecSorting {

public static void main(String[] args) {

    RecSorting obj= new RecSorting();
    int a[]={3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
    obj.sortArray(a);

    System.out.println(Arrays.toString(a));
    
}
    public void sortArray(int[] nums) {
        sort(nums, nums.length - 1);
    }

    public void sort(int[] nums, int lastPos) {
        if (lastPos == 0) {
            return;
        }

        int element = nums[lastPos];
        sort(nums, lastPos - 1);

        int i;
        for (i = lastPos - 1; i >= 0; i--) {
            if (nums[i] > element) {
                nums[i + 1] = nums[i];
            } else {
                break;
            }
        }
        nums[i + 1] = element;
    }
}
