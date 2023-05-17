package recursion;
import java.util.Arrays;

public class ReverseArray {
    
    public static void main(String[] args)
    {
        char ch[]={'/','\ue666','\ua65d','\u4206','\u0000','\uaab4','\u2798','a','0',' '};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }

    static void reverseString(char[] s) 
    {reverseStringHelper(s,0,s.length-1);}

   static void reverseStringHelper(char s[], int left,int right)
    {
        if(left>=right)
        return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverseStringHelper(s,left+1,right-1);
    }
}
