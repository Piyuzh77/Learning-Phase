package recursion;


public class SimpleProb {
    public static void main(String[] args) {
        
        System.out.println(fact(4));
        System.out.println(sumOfDig(99));
        //    conceptual(5); /*this code will run infinitly */
           conceptual2(5);
           System.out.println(revDig(45));
    }

    static int fact(int n)
    {
        if(n>1)
        return (n*fact(n-1));
        else 
        return 1;
    }
/*
 *    4
 *   / 
 *  4*f3
 *    \
 *     3*f2
 *      \
 *       2*f1
 *        \
 *          1
 */


    static int sumOfDig(int n)
    {
        if(n==0)
        return 0;
        return n%10+sumOfDig(n/10);
    }
    /*
     * hard one in the easy problem set
     */

     static void conceptual(int n){
     if(n==0)
     return;
     System.out.println(n);
     conceptual(n--);
     }

     static void conceptual2(int n){
        if(n==0)
        return ;
        System.out.println(n);
        conceptual2(--n);
     }

     /*
     504
     40+50 wrng
     40+0
      */

     static int revdig=0;
     static int revDig(int n)//504,9099,0901,1090
     {
       if(n==0)
       return revdig;
       else if(n/10==0)

       revdig=n%10;
       return((revdig*10)+revDig(n/10));
     }
}
