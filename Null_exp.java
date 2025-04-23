import java.util.*;
class Null_exp
{
	public static void main(String args[])
	{
		try
		{
			String ptr=null;
			if(ptr.equals("hai"))
			{
				System.out.println("Same value");
			}
			else
			{
				System.out.println("not Same");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}
