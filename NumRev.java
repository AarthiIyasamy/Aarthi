import java.io.*;
import java.util.*;
public class NumRev
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        System.out.println(b);
    }
}
