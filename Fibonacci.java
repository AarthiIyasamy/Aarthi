import java.io.*;
import java.util.*;
public class Fibonacci
{
    int Fibo(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return ((Fibo(n-1))+(Fibo(n-2)));
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=s.nextInt();
        int ans;
        Fibonacci f=new Fibonacci();
        ans=f.Fibo(n);
        System.out.println(ans);
    }
}
