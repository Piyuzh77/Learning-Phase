package Stack;
import java.util.*;
public class MaxAreaHistogram {
    static int largestRectangleArea(int a[])
    {
        Stack<Integer> stack= new Stack<Integer>();
        int right[]= new int[a.length];
        int left[]= new int[right.length];
        int maxArea=0;

        // for Next Smaller value's indexes
        for(int i=a.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&a[stack.peek()]>=a[i])
            stack.pop();

            int value=stack.isEmpty()? a.length:stack.peek();
            right[i]=value;
            stack.push(i);
        }
        stack.clear(); //because ham hai kanjoos, and we'll use the same stack again!!
        // for Previous Smaller value's indexes
        for(int i=0;i<a.length;i++)
        {
            while(!stack.isEmpty()&&a[stack.peek()]>=a[i])
            stack.pop();

            int value=stack.isEmpty()? 0:stack.peek()+1;
            left[i]=value;
            stack.push(i);
        }
       for(int i=0;i<a.length;i++)
       {
            int area= a[i]*(right[i]-left[i]);
            maxArea=Math.max(maxArea, area);
       }
       return maxArea;
    }
    public static void main(String[] args) {
        
        int i[]={4,2,6,4,5,1,3};
        System.out.println(largestRectangleArea(i));
    }
}