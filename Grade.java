import java.util.*;
class Grade{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter marks of student : ");
		int marks = sc.nextInt();
		if(marks > 85 && marks <= 100)
		{
			System.out.println("distiction");
		}
		else if(marks > 70  && marks <= 85)
		{
			System.out.println("first class");
		}
		else if(marks > 55  && marks <= 70)
		{
			System.out.println("second class");
		}
		else if(marks > 40  && marks <= 55)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
}