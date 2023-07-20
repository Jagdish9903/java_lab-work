import java.util.*;
class DoubleSort{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of elements for A : ");
		int n = sc.nextInt();
		System.out.print("enter the no. of elements for B : ");
		int m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];
		int c[] = new int[m+n];

		System.out.print("\nenter the elements of A : ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			c[i] = a[i];
		}

		System.out.print("\nenter the elements of B : ");
		for(int i=0;i<m;i++)
		{
			b[i] = sc.nextInt();
			c[i+n] = b[i];
		}

		//sorting
		for(int i=0;i<m+n-1;i++)
		{
			for(int j=0;j<m+n-i-1;j++)
			{
				if(c[j]>c[j+1])
				{
					int tmp = c[j];
					c[j] = c[j+1];
					c[j+1] = tmp;
				}
			}
		}

		//printing

		System.out.println("sorted array C is : ");
		for(int i=0;i<m+n;i++)
		{
			System.out.print(c[i] + "\t");
		}

	}
}