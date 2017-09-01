import java.io.*;
import java.util.*;
public class Arm
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n=s.nextInt();
        int a=0,temp,b;
        temp=n;
        while(n>0)
        {
            b=n%10;
            n=n/10;
            a=a+(b*b*b);
        }
        if(temp==a)
        {
            System.out.println(" Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
        
    }
}
