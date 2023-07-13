import java.util.*;
class SwitchCalc{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number : ");
		int a = sc.nextInt();
		System.out.print("enter first number : ");
		int b = sc.nextInt();
		System.out.print("enter the operator : ");
		char op = sc.next().charAt(0);
		switch(op)
		{
			case '+':
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case '-':
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case '*':
				System.out.println(a + " * " + b + " = " + (a*b));
				break;
			case '/':
				System.out.println(a + " / " + b + " = " + (a/(double)b));
				break;
			default:
				System.out.println("invalid operator!");
				break;
		}
	}
}