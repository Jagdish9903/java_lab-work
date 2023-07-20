import java.util.*;
class Sum2
{
	static int fact(int n)
	{
		int ans = 1;
		for(int i=2;i<=n;i++)
		{
			ans *= i;
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of terms : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum += fact(i);
			System.out.print(i + "! + ");
		}
		System.out.print("...");
		System.out.println("\nsum of given series is  : " + sum);
	}
}