import java.util.*;
class Calculator{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number : ");
		int a = sc.nextInt();
		System.out.print("enter second number : ");
		int b = sc.nextInt();
		System.out.print("enter operator : ");
		char op = sc.next().charAt(0);
		if(op == '+')
		{
			System.out.println(a + " + " + b + " = " + (a+b));
		}
		else if(op == '-')
		{
			System.out.println(a + " - " + b + " = " + (a-b));
		}
		else if(op == '*')
		{
			System.out.println(a + " * " + b + " = " + (a*b));
		}
		else if(op == '/')
		{
			System.out.println(a + " / " + b + " = " + (a/(double)b));
		}
		else
		{
			System.out.println("invalid operator!");
		}
	}
}