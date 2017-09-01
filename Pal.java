import java.io.*;
import java.util.*;
public class Pal
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        String c=b.toString();
        if(a.equals(c))
        {
            System.out.println("The Given Number is a Palindrome Number");
        }
        else
        {
            System.out.println("The Given Number is not a Palindrome Number");
        }
    }
}
