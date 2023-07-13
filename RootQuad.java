import java.util.*;
import java.lang.Math;
class RootQuad{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a : ");
		int a = sc.nextInt();
		System.out.print("enter b : ");
		int b = sc.nextInt();
		System.out.print("enter c : ");
		int c = sc.nextInt();
		double d = b*b - 4*a*c;
		double x,y;
		if(d>0)
		{
			x = (-b + Math.pow(d,0.5))/2.0*a;
			y = (-b - Math.pow(d,0.5))/2.0*a;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
		else if(d == 0)
		{
			x = y = -b/2.0*a;
			System.out.println("x  = " + x);
		}
		else
		{
			System.out.println("equation contains complex roots.");
			double real = -b/2.0*a;
			double imag = Math.sqrt(-d)/2.0*a;
			System.out.println("x = " + real + " + " + (imag) + "i");
			System.out.println("x = " + real + " - " + (imag) + "i");
		}
	}
}