import java.io.*;
import java.util.*;

public class Largest {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any three numbers:");
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
	if(x>y && x>z)
	{
		System.out.println("The first No. is the largest");
	}
	else if(y>x && y>z)
	{
		System.out.println("The Second No. is the largest");
	}
	else if(z>x && z>y)
	{
		System.out.println("The Third No. is the largest");
	}
	else
	{
		System.out.println("Nothing is the largest");
	}
	}

}
