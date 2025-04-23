import java.util.*;
class EvenException extends Exception
{
	EvenException(String s)
	{
		super(s);
	}
}
class OddException extends Exception
{
	OddException(String s)
	{
		super(s);
	}
}
class oddEven
{
	static void odd(int x) throws OddException
	{
		if(x%2!=0)
		{
			throw new OddException("Odd number...");
		}
	}
	static void even(int x) throws EvenException
	{
		if(x%2==0)
		{
			throw new EvenException("Even number...");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=s.nextInt();
		try
		{
			odd(n);
			even(n);
		}
		catch (OddException e)
		{
			System.out.println(e);
		}
		catch (EvenException e)
		{
			System.out.println(e);
		}
	}
}
