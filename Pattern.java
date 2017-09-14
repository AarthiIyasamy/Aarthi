import java.io.*;
import java.util.*;
public class Pattern
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=0;i<=n;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
