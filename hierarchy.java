	import java.util.*;
	class publisher
	{
		String pname,agname;
		publisher(String pname,String agname)
		{
			this.pname=pname;
			this.agname=agname;
		}
	}
	class book extends publisher
	{
		String bname,author;
		float price;
		book(String bname,String author,float price,String pname,String agname)
		{
			super(pname,agname);
			this.bname=bname;
			this.author=author;
			this.price=price;
		}
	}
	class literature extends book
	{
		literature(String bname,String author,float price,String pname,String agname)
		{
			super(bname,author,price,pname,agname);
		}
		void display1()
			{
				System.out.println("\nName of publisher:"+pname);
				System.out.println("agency name:"+agname);
				System.out.println("Name of the book:"+bname);
				System.out.println("author of book:"+author);
				System.out.println("price:"+price);
			}
	}
	class fiction extends book
	{
		fiction(String bname,String author,float price,String pname,String agname)
		{
			super(bname,author,price,pname,agname);
		}
		void display2()
			{
				System.out.println("\nName of publisher:"+pname);
				System.out.println("agency name:"+agname);
				System.out.println("Name of the book:"+bname);
				System.out.println("author of book:"+author);
				System.out.println("price:"+price);
			}
	}
	class Hierarchy
	{
		public static void main(String args[])
		{
			Scanner s1=new Scanner(System.in);
			Scanner s2=new Scanner(System.in);
			String pn,an,bn,a;
			float p;
			int n1,n2;
			System.out.println("Enter the no of Literature book:");
			n1=s1.nextInt();
			literature[] l=new literature[n1];
			for(int i=0;i<n1;i++)
			{
				System.out.print("\nEnter the publisher name:");
				pn=s2.nextLine();
				System.out.print("Enter the agency name:");
				an=s2.nextLine();
				System.out.print("Enter the name "+(i+1)+" of book:");
				bn=s2.nextLine();
				System.out.print("Enter the author name:");
				a=s2.nextLine();
				System.out.print("Enter the price:");
				p=s1.nextInt();
				l[i]=new literature(bn,a,p,pn,an);
			}
			System.out.println("\nEnter the no of fiction book:");
			n2=s1.nextInt();
			fiction[] f=new fiction[n2];
			for(int i=0;i<n2;i++)
			{
				System.out.print("\nEnter the publisher name:");
				pn=s2.nextLine();
				System.out.print("Enter the agency name:");
				an=s2.nextLine();
				System.out.print("Enter the name "+(i+1)+" of book:");
				bn=s2.nextLine();
				System.out.print("Enter the author name:");
				a=s2.nextLine();
				System.out.print("Enter the price:");
				p=s1.nextInt();
				f[i]=new fiction(bn,a,p,pn,an);
			}
			System.out.println("\nliterature book details are....\n");
			for(int i=0;i<n1;i++)
			{
				l[i].display1();
			}
			System.out.println("\nfiction book details are....\n");
			for(int i=0;i<n2;i++)
			{
				f[i].display2();
			}
		}
	}
