package Stack;
/*
 * so agar input [75,75,75,75,75,75] hai to output
 * [1,2,3,4,5,6] ayega
 * that is every single stock ka btane ka hai ki usse phele kitne low stocks the
 * agar usse pehle nahi tha koi low stock to value 1
 */
import java.util.*;
public class StockSpanning {
    
    static int[] StockSpan(int stockValues[])
    {
        int ans[]=new int[stockValues.length];
        Stack<Integer> stack= new Stack<Integer>();
        HashMap<Integer,Integer>ArbMap= new HashMap<Integer,Integer>();
        for(int i=0;i<stockValues.length;i++)
        {   
            ArbMap.put(stockValues[i],i);
            while(!stack.isEmpty() && stack.peek()<stockValues[i])
            {   
                stack.pop();
            }
            ans[i]= stack.isEmpty()? i+1:i-ArbMap.get(stockValues[i]);
            stack.push(stockValues[i]);

            if(ans[i]==0)
            ans[i]++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static void main(String[] args) {

        int[] stocks={7,2,8,0,52,6};
        StockSpan(stocks);
        
    }
}
