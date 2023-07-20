import java.util.*;
class Matrix{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----FOR 1ST MATRIX-----\n");
		System.out.print("enter the no. of rows : ");
		int n1 = sc.nextInt();
		System.out.print("enter the no. of cols : ");
		int m1 = sc.nextInt();
		int a[][] = new int[n1][m1];

		System.out.println("-----FOR 2ND MATRIX-----\n");
		System.out.print("enter the no. of rows : ");
		int n2 = sc.nextInt();
		System.out.print("enter the no. of cols : ");
		int m2 = sc.nextInt();
		int b[][] = new int[n2][m2];
		
		if(m1 != n2)
		{
			System.out.println("matrix multiplication is not possible!");
			return;
		}

		System.out.print("enter the elements of first matrix : ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				//System.out.print("a[" + i +"][" + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("enter the elements of first matrix : ");
		for(int i=0;i<n2;i++)
		{
			for(int j=0;j<m2;j++)
			{
				//System.out.print("a[" + i +"][" + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}


		//multiplication
		int c[][] = new int[n1][m2];
		int sum; 
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m2;j++)
			{
				sum = 0;
				for(int k=0;k<n2;k++)
				{
					sum += a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}


		//print the answer
		System.out.println("the multiplication matrix is : ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<m2;j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}