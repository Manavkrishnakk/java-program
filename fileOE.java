import java.io.*;
import java.util.*;
class fileOE
{
	public static void main(String args[])
	{
		int i,x;
		try
		{
			FileReader f1=new FileReader("sample.txt");
			FileWriter f2=new FileWriter("fileeven.txt");
			FileWriter f3=new FileWriter("fileodd.txt");
			while((i=f1.read())!=-1)
			{
				
				if(i%2==0)
				{
					f2.write(i);
				}
				else
				{
					f3.write(i);
				}
			}
			f1.close();
			f2.close();
			f3.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
