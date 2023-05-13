package Stack;
import java.util.*;
public class NextGreater {

    static HashMap<Integer,Integer> NGL(int quesArr[])
    {
        HashMap<Integer,Integer> ans= new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        int value;
        for(int i=0;i<quesArr.length;i++)
        //checking from right to left
        {
            while(!stack.isEmpty() && stack.peek()<quesArr[i])
            stack.pop();
            // for the very first itteration stack is empty=> condition not satisfied

            value= stack.isEmpty()? -1:stack.peek(); //jab badi value na milri ho right me tab ye karna hai
            ans.put(quesArr[i], value);

            stack.push(quesArr[i]);// ultimately last me push karne ka hai value ko stack me kyunki 

        }
        System.out.println(ans);
        return ans;
    }
    static HashMap<Integer,Integer> NGR(int quesArr[])
    {
        HashMap<Integer,Integer> ans= new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        int value;
        for(int i=quesArr.length-1;i>=0;i--)
        //checking from right to left
        {
            while(!stack.isEmpty() && stack.peek()<quesArr[i])
            stack.pop();
            // for the very first itteration stack is empty=> condition not satisfied

            value= stack.isEmpty()? -1:stack.peek(); //jab badi value na milri ho right me tab ye karna hai
            ans.put(quesArr[i], value);
            stack.push(quesArr[i]);// ultimately last me push karne ka hai value ko stack me kyunki 

            // System.out.println(ans.hashCode());
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner (System.in);
        int ques[]={6,1,4,8,2,9,7};
        
        NGR(ques);
        NGL(ques);
    }
}
