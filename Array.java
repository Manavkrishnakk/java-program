import java.util.*;
class Array
{
	public static void main(String args[])
	{
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter new element:");
		numbers.add(s.nextInt());
		System.out.println("List:"+numbers);
		int accessednumber=numbers.get(2);
		System.out.println("Accessed element:"+accessednumber);
		int removednumber=numbers.remove(0);
		System.out.println("Removed element:"+removednumber);;
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i)+" ");
		}
	}
}
