import java.util.*;
class Complex
{
	int r,i;
	Complex(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	void sum(Complex c1,Complex c2)
	{
		int x, y;
		x=c1.r+c2.r;
		y=c1.i+c2.i;
		if(x<0&&y<0)
		{
			System.out.println("Sum of complex number="+x+y+"i");
		}
		else if(x>0&&y<0)
		{
			System.out.println("Sum of complex number="+x+y+"i");
		}
		else
		{
			System.out.println("Sum of complex number="+x+"+"+y+"i");
		}
	}
}
class complex
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int r1,i1,r2,i2;
		System.out.println("Enter the real and imaginary part of first complex number:");
		r1=s.nextInt();
		i1=s.nextInt();
		Complex c1=new Complex(r1,i1);
		System.out.println("Enter the real and imaginary part of second complex number:");
		r2=s.nextInt();
		i2=s.nextInt();
		Complex c2=new Complex(r2,i2);
		Complex c3=new Complex(0,0);
		c3.sum(c1,c2);
	}
}
