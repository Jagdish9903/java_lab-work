import java.util.*;
class Employee
{
	String emp_name,dept;
	int salary;
	Employee()
	{
		emp_name = "abc";
		dept = "it";
		salary = 0;
	}
	Employee(String d_name,String d_dept,int d_salary)
	{
		emp_name = d_name;
		dept = d_dept;
		salary = d_salary;
	}
	Employee(Employee ob)
	{
		this.emp_name = ob.emp_name;
		this.dept = ob.dept;
		this.salary = ob.salary;
	}
	void display()
	{
		System.out.println("emplyee name : " + emp_name);
		System.out.println("emplyee department : " + dept);
		System.out.println("emloyee salary : " + salary);
	}
}
class Class2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name,dept;
		int salary;
		System.out.print("enter name : ");
		name = sc.nextLine();
		System.out.print("enter department : ");
		dept = sc.nextLine();
		System.out.print("enter salary : ");
		salary = sc.nextInt();
		Employee e1 = new Employee();
		Employee e2 = new Employee(name,dept,salary);
		Employee e3 = new Employee(e2);
		Employee e4 = e3;
		e2.emp_name = "RISHABH";
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
}