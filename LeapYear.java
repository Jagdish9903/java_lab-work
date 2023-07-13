import java.util.*;
class LeapYear{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a year : ");
		int year = sc.nextInt();
		if(year % 4 != 0 || (year%100==0 && year%400!=0))
		{
			System.out.print("it is not a leap year");
		}
		else 
		{
			System.out.print("it is a leap year");
		}
	}
}