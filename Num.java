import java.io.*;
import java.util.*;
public class Num
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0)
{
System.out.println("The given number"+n+" is Positive");
}
else if(n<0)
{
System.out.println("The given number"+n+"is Negative");
}
else
{
System.out.println("The given number is Zero");
}
}
}
