import java.util.*;
interface  shape
{
	void area_circle();
	void perimater_circle();
	void area_rect();
	void perimater_rect();
}
class circle implements shape
{
	float r;
	public void getcircle(float r)
	{
		this.r=r;
	}
	public void area_circle()
	{
		System.out.println("Area of circle="+(3.14*r*r));
	}
	public void perimeter_circle()
	{
		System.out.println("Perimeter of circle="+(2*3.14*r));
	}
}
class rect implements shape
{
	int l,b;
	public void getrect(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area_rect()
	{
		System.out.println("Area of rectangle="+(l*b));
	}
	public void perimeter_rect()
	{
		System.out.println("Perimeter of rectangle="+(2*(l+b)));
	}
}
class help
{
	int l,b;
	float r;
	Scanner sc=new Scanner(System.in);
	void getinfo1()
	{
		System.out.println("Enter the length:");
		l=sc.nextInt();
		System.out.println("Enter the breadth:");
		b=sc.nextInt();
	}
	void getinfo2()
	{
		System.out.println("Enter the radius:");
		r=sc.nextInt();
	}
}
class Intermain extends help
{
	public static void main(String args[])
	{
		int c;
		help h=new help();
		circle c=new circle();
		rect r=new rect();	
		System.out.println("\t.....MENU......\n1=area of circle\n2=area of rectangle\n3=perimeter of circle\n4=perimeter of rectangle\n5=exit\n\n");
		System.out.print("Enter the option:");
		c=sc.nextInt();
		while(c!=5)
		{
			switch(c)
			{
				case 1:h.getinfo2();
			                           c.getcircle(r);
			                           c.area_circle();
			               case 2:h.getinfo1();
			                           r.getrect(l,b);
			                           r.area_rect();
			               case 3:h.getinfo2();
			                           c.getcircle(r);
			                           c.perimeter_circle();
			              case 4:h.getinfo1();
			                           r.getrect(l,b);
			                           r.perimeter_rect();
			              case 5:break;
			}
		}
		
	}
}
