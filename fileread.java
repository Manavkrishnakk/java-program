import java.io.*;
import java.util.*;
class fileread
{
	public static void main(String args[])
	{
		int i;
		try
		{
			FileWriter f1=new FileWriter("file1.txt");
			FileReader f2=new FileReader("file1.txt");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the content to insert into the file:");
			String data=s.nextLine();
			System.out.println("content write to file1.txt");
			f1.write(data);
			f1.close();
			System.out.println("read the contents from  file1.txt");
			while((i=f2.read())!=-1)
			{
				System.out.print((char)i);
			}
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
