import java.util.*;
class Tmain
{
	static void age(int x) throws Exception
	{
	if(x<18) 
	{
		throw new Exception("valid only for above 18 year old citizens...");
	}
	else
	{
		System.out.println("Successfully login...");
	}
	}	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the age:");
		n=s.nextInt();
		try
		{
			age(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
