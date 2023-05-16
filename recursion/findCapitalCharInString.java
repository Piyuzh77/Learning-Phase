package recursion;

public class findCapitalCharInString {

    public static void main(String[] args) {
        String s="geekSyiuy";
       System.out.println(findCapInString(s));
    }
    
    static char findCapInString(String S)
    {
        if(S.isEmpty())
        return '/';

        char firstChar=S.charAt(0);

        if(Character.isUpperCase(firstChar))
        return firstChar;

        else{
            String newstring=S.substring(1);
            return findCapInString(newstring);
        }
     }
}
