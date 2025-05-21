import java.io.*;
import java.util.*;
class fileEO
{
	public static void main(String args[])
	{

		try
		{
			FileReader f1=new FileReader("sample.txt");
			FileWriter f2=new FileWriter("fileeven.txt");
			FileWriter f3=new FileWriter("fileodd.txt");
			Scanner sc=new Scanner(f1);
			String s=sc.nextLine();
			StringTokenizer st=new StringTokenizer(s,"\n");
			int i;
			while(st.hasMoreTokens())
			{
				String str=st.nextToken();		
				i=Integer.parseInt(str);
				if(i%2==0)
				{
					f2.write(str);
				}
				else
				{
					f3.write(str);
				}
			}
			f1.close();
			f2.close();
			f3.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}
