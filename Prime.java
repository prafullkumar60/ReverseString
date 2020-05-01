import java.util.*;
public class prime
{
	public static void main(String[] args)
	{
		System.out.println("Enter number to check prime");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i=2;
		while(i<x)
		{
			if(x%i==0)
				break;
			i++;
		}
		if(i==x)
			System.out.println(x+" is prime mumber");
		else
			System.out.println(x+" is not prime number");
	}
}
			
