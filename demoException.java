import java.util.Arrays;

public class demoException {
    public static void main(String[] args) {
        int i,j,k=0;
        j=2;
        i=9;
        int a[]= new int[4];
        try {
            k=i/j;
            for(int c=0;c<=4;c++)
            {
                a[c]=c+1;
            }
            System.out.println(Arrays.toString(a));
        } catch (ArithmeticException e) {
            System.out.println("Exception: cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("overflowing values");
        }

      System.out.println(k);
    }
}
