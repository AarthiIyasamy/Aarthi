import java.io.*;
import java.util.*;
public class Compare
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any two Strings:");
String a=s.nextLine();
String b=s.nextLine();
if(a.equals(b))
{
System.out.println("Both the Strings are equal");
}
else
{
System.out.println("They are unequal");
}
}
}
