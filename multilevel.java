class Person
{
	int age;
	String name,gender,address;
	Person(String name,String gender,int age,String address)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}
}
class Employee extends Person
{
	int emp_id;
	String c_name,qual;
	float salary;
	Employee(String name,String gender,int age,String address,int emp_id,String c_name,String qual,float salary)
	{
		super(name,gender,age,address);
		this.emp_id=emp_id;
		this.c_name=c_name;
		this.qual=qual;
		this.salary=salary;
	}
	void display1()
	{
	
	}
}
class Teacher extends Person
{
	int t_id;
	String sub,dept;
	Teacher(String name,String gender,int age,String address,int emp_id,String c_name,String qual,float salary,int t_id,String sub,String dept)
	{
		super(name,gender,age,address,emp_id,c_name,qual,salary);
		this.t_id=t_id;
		this.sub=sub;
		this.dept=dept;
	}
	void display2()
	{
		System.out.println("Person name="+name);
		System.out.println("Person age="+age);
		System.out.println("Person gender="+gender);
		System.out.println("Person address="+address);
		System.out.println("Employee id="+emp_id);
		System.out.println("Company name="+c_name);
		System.out.println("qualification="+qual);
		System.out.println("Employee salary="+salary);
		System.out.println("Teacher id="+t_id);
		System.out.println("Subject name="+sub);
		System.out.println("Department="+dept);
	}
}
class multilevel
{
	public static void main(String args[])
	{
		int n,a,t_id,e_id;
		String na,gen,add,cname,q,sub,dep;
		float s;
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("\nEnter the number of teachers:");
		n=s1.nextInt();
		Teacher[] t=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the  Person name:");
			na=s1.nextLine();
			System.out.print("Enter the  Person gender:");
			gen=s1.nextLine();
			System.out.print("Enter the  Person age:");
			a=s2.nextInt();
			System.out.print("Enter the  Person address:");
			add=s1.nextLine();
			System.out.print("Enter the  Employee id");
			e_id=s2.nextInt();
			System.out.print("Enter the company name");
			cname=s1.nextLine();
			System.out.print("Enter the  qualification:");
			q=s1.nextLine();
			System.out.print("Enter the  salary:");
			s=s2.nexFloat();
			System.out.print("Enter the  teacher id");
			t_id=s2.nextInt();
			System.out.print("Enter the department");
			dep=s1.nextLine();
			System.out.print("Enter the subject");
			sub=s1.nextLine();
			t[i]=new Teacher(na,gen,a,add,e_id,cname,q,s,t_id,dep,sub);
		}
		
	}
}
