import java.util.*;
class NegativeException extends Exception
{
	NegativeException(String s)
	{
		super(s);
	}
}
class Avgexp
{
	void checknum(int x) throws NegativeException
	{
	int num;
	double sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	for(int i=0;i<x;i++)
	{
		num=s.nextInt();
		if(num<0)
		{
			throw new NegativeException("-ve number occured....,cannot find average....");
		}
		sum+=num;
	}
	System.out.println("Average of the numbers are:"+sum/x);
	}
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total no of +ve integers:");
		n=s.nextInt();
		Avgexp a=new Avgexp();
		try
		{
			a.checknum(n);
		}
		catch(NegativeException e)
		{
			System.out.println(e);
		}	
		System.out.println("program terminated....");
	}	
}
