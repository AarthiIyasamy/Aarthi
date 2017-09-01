import java.io.*;
import java.util.*;
public class Su
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any Number:");
int n=s.nextInt();
int i=1,sum=0;
do
{
sum=sum+i;
i++;
}
while(i<=n);
System.out.println(sum);
}
}
