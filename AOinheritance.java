import java.util.*;
class Employee
{
	int emp_id;
	String name,address;
	float salary;
	Employee(int emp_id,String name,float salary,String address)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}
class Teacher extends Employee
{
	String dept,subtaught;
	Teacher(int emp_id,String name,float salary,String address,String dept,String subtaught)
	{
		super( emp_id,name, salary, address);
		this.dept=dept;
		this.subtaught=subtaught;
	}
	void display()
	{
		System.out.println("\nEmployee id="+emp_id);
		System.out.println("Employee name="+name);
		System.out.println("Employee salary="+salary);
		System.out.println("Employee address="+address);
		System.out.println("Department of teacher="+dept);
		System.out.println("Subject Taught="+subtaught);
	}
}
class AOinheritance
{
	public static void main(String args[])
	{
		int n,id,search,flag=0,c=0;
		String na,add,sub,d;
		float s;
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the number of teachers:");
		n=s1.nextInt();
		Teacher[] t=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+" employee id:");
			id=s1.nextInt();
			System.out.print("Enter the "+(i+1)+" employee name:");
			na=s2.nextLine();
			System.out.print("Enter the "+(i+1)+" employee salary:");
			s=s1.nextFloat();
			System.out.print("Enter the "+(i+1)+" employee address:");
			add=s2.nextLine();
			System.out.print("Enter the  department of teacher:");
			d=s2.nextLine();
			System.out.print("Enter the  subject teacher taught:");
			sub=s2.nextLine();
			t[i]=new Teacher(id,na,s,add,d,sub);
		}
		System.out.print("\nEnter the employee id to search:");
		search=s1.nextInt();
		for(int i=0;i<n;i++)
		{
			if(t[i].emp_id==search)
			{
				flag=1;
				c=search;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("\nEmployee found....");
			t[c-1].display();	
		}
		else
		{
			System.out.println("Employee not found");
		}
	}
}
