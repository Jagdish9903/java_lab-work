import java.util.*;
class FerenhitToCelcius{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the temparature in ferenhit : ");
		double f = sc.nextDouble();
		double c = 5*(f-32)/9.0;
		System.out.println("celcius = " + c);
	}
}