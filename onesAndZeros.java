import java.util.Arrays;

/**
 * onesAndZeros
 */
// import java.util.*;
public class onesAndZeros {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        int a[][]= 
        {/*0*/{1,1,0,0,0},
         /*1*/{1,1,1,0,0},
         /*2*/{1,1,1,1,0},
         /*3*/{1,1,1,1,1},
         /*4*/{0,0,0,0,0},
         /*5*/{1,0,0,0,0}};
        // System.out.println(Arrays.toString());
        int k=3;
        int store[]=new int[k];
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            int zeros=0,ones=0;
            for(int j=0;j<a[i].length;j++)
            {
               if (a[i][j]==1)
               {
                    ones+=1;
               }
               else if (a[i][j]==0)
               zeros+=1;
            }
            if(zeros>ones)
            {
                store[t]=i;
                t++;
            }
        }

            Arrays.sort(store);
            System.out.println(Arrays.toString(store));
            
    }
    }