import java.util.*;
class Student
{
	int id;
	String name;
	double cpi;
	Student(int id, String name, double cpi)
	{
		this.id = id;
		this.name = name;
		this.cpi = cpi;
	}
	void display()
	{
		System.out.println("student id : " + id);
		System.out.println("student name : " + name);
		System.out.println("student cpi" + cpi);
	}
}
class Class1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		double cpi;
		Student s;
		System.out.print("enter name : ");
		name = sc.nextLine();
		System.out.print("enter id : ");
		id = sc.nextInt();
		System.out.print("enter CPI : ");
		cpi = sc.nextDouble();
		s = new Student(id,name,cpi);
		s.display();

	}
}