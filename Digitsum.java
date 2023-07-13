import java.util.*;
class Digitsum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0)
		{
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println("sum of digits is : " + sum);
	}
}