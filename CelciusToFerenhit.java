import java.util.*;
class CelciusToFerenhit{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the temparature in ferenhit : ");
		double c = sc.nextDouble();
		double f = 9*c/5.0 + 32;
		System.out.println("ferenhit = " + f);
	}
}