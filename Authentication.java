import java.util.*;
class UsernameException extends Exception
{
	UsernameException(String s)
	{
		super(s);
	}
}
class PasswordException extends Exception
{
	PasswordException(String s)
	{
		super(s);
	}
}
class Authentication
{
	static void checkuser() throws UsernameException
	{
		throw new UsernameException("invalid username....");
	}
	static void checkpass() throws  PasswordException
	{
		throw new PasswordException("invalid password....");
	}
	public static void main(String args[])
	{
		String u_check;
		int p_check;
		String user="manav@#";
		int pass=123456;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the username:");
			u_check=s.nextLine();
			if(u_check.length()<6 && u_check!=user)
			{
				System.out.println("Authentication failed....");
				checkuser();
			}
			else
			{
				try
				{
					System.out.println("Enter the password:");
					p_check=s.nextInt();
					if(p_check!=pass)
					{
						checkpass();
					}
					else
					{
						System.out.println("Authentication successfull....");
					}
				}
				catch(PasswordException e)
				{
					System.out.println(e);
				}
			}
		}
		catch(UsernameException e)
		{
			System.out.println(e);
		}
	}
}
