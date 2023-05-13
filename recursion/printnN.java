package recursion;

/**
 * printnN
 */
public class printnN {

    static void print(int n)
    {
        if(n==1)
        System.out.println(n);
        else{
        print(n-1);
        System.out.println(n);
        }
    }

    public static void main(String[] args) {
        print(7);
    }
}