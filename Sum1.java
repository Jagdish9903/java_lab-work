import java.util.*;
class Sum1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of elements : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=2*n;i+=2)
		{
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.print("...");
		System.out.println("\nsum of given series is : " + sum);
	}
}
