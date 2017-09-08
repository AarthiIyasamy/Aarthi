import java.io.*;
import java.util.*;
public class Rev
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=s.nextLine();
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        System.out.println(b);
        
    }
}
