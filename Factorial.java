import java.io.*;
import java.util.*;
public class Factorial
{
int Fact(int n)
{
if(n==1)
{
return 1;
}
else
{
return ((n)*(Fact(n-1)));
}}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any Number:");
int n=s.nextInt();
int ans;
Factorial f=new Factorial();
ans=f.Fact(n);
System.out.println(ans);
}
}
