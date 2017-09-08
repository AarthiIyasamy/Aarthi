import java.io.*;
import java.util.*;
public class RevNum
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digits of an integer to be reversed:");
        String a=s.nextLine();
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        System.out.println(b);
        
    }
}

