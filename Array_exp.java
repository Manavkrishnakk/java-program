import java.util.*;
class Array_exp
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array elements:");
		n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the array elements:");	
		try
		{
			for(int i=0;i<=n;i++)
			{
				arr[i]=s.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This block always execute....");
		}
		System.out.println("hai");
	}
}
