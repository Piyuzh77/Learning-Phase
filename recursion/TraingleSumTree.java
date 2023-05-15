package recursion;

import java.util.Arrays;

public class TraingleSumTree {
    

    static void Sum(int a[], int n)
    {
        if(n==1)
      { System.out.println(Arrays.toString(a)); return;}
      
        //to store the sum of the next two concurrent elements
        int newArr[]= new int[n-1];
        for(int i=0;i<newArr.length;i++)
        newArr[i]=a[i]+a[i+1];

        // calling it again for the newly formed newArr array
        Sum(newArr, n-1);

        if(n==a.length)
        System.out.println(Arrays.toString(a));

        else{
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        Sum(a, a.length);
    }
}
