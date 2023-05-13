import java.util.Scanner;
class RandomPassword {
    
private String PasswordGen(int n)
{
    String Special_char= "!@#$%^&*()_=+<>?:{}|,./;'[]`";
    String Numbers= "0123456789123456789012345678";
    String LowerCase_alpha= "abcdefghijklmnopqrstuvwxyz q";
    String UpperCase_alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ Q";

    String[] st= new String[4];
    st[0]=Special_char;
    st[1]=Numbers;
    st[2]=LowerCase_alpha;
    st[3]=UpperCase_alpha;
    
    char arr[] = new char[n];
        for(int i=0;i<n;i++)
        {
            int index= (int) ((int) 4.0*Math.random());  
            arr[i]= st[index].charAt((int) Math.floor(Math.random()*st[index].length()));
            /*
             * finding character at random= rand* (max-min)+min;
             */
        }

        String Password="";
        for(int i=0;i<arr.length;i++)
        {
            Password=arr[i]+Password;
        }

        return Password;

}
    public static void main(String[] args){
        long start_time=System.currentTimeMillis();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of the Password");
            int n=sc.nextInt();
            RandomPassword ob= new RandomPassword();
            ob.PasswordGen(n);
            System.out.println("your password is: "+ob.PasswordGen(n));
        }
        long end_time=System.currentTimeMillis();
        System.out.println("time taken to execute the program: "+(end_time-start_time)+"ms");
    }
}
