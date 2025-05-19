import java.io.*;
class filecopy
{
	public static void main(String args[])
	{
		int i;
		try
		{
			FileReader f1=new FileReader("f1.txt");
			FileWriter f2=new FileWriter("f2.txt");
			while((i=f1.read())!=-1)
			{
				f2.write(i);
			}
			System.out.println("file write successfully..");
			f1.close();
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
