package Stack;

/*
 * 
    1 0 1 0 0
    1 0 |1 1 1|
    1 1 |1 1 1|
    1 0 0 1 0
    output 6
 */
import java.util.*;
public class MaxAreaBinaryMat {

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
        stack.clear();
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

    static int maximalRectangle(char [][] Matrix)
    {
        int maxarea=-1;
        int IntMatrix[][]= new int[Matrix.length][Matrix[0].length];
        for(int i=0;i<Matrix.length;i++)
        {
            for(int j=0;j<Matrix[i].length;j++)
                IntMatrix[i][j]=Integer.parseInt(String.valueOf(Matrix[i][j]));
        }

        int arbAr[]= new int[Matrix[0].length];
        for(int i=0;i<Matrix[0].length;i++)
            arbAr[i]=0;

        for(int i=0;i<Matrix.length;i++)
        {
            for(int j=0;j<Matrix[i].length;j++)
            {
                // arbAr[j]=IntMatrix[i][j];
                if(IntMatrix[i][j]==1)
                arbAr[j]+=1;
                else
                arbAr[j]=0;
            }
            int area=largestRectangleArea(arbAr);
            maxarea=Math.max(maxarea, area);
        }
        return maxarea;
    }

    public static void main(String args[])
    {
        char[][] i= {
        {'1','0','1','0','1'},
        {'0','1','0','1','0'},
        {'1','0','1','0','1'},
        {'0','1','0','1','0'}};
        System.out.println((maximalRectangle(i)));
    }
    
}
