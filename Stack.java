import java.util.*;
class Stack1
{
	Scanner sc = new Scanner(System.in);
	int top=-1;
	int n = 5;
	int s[] = new int[n];
	void push()
	{
		if(top+1 >= n)
		{
			System.out.println("stack overflow!");
		}
		else
		{
			System.out.println();
			System.out.print("enter the element to push : ");
			s[++top] = sc.nextInt();
			System.out.println("pushed " + s[top] + " on top of stack.");
		}
	}
	void pop()
	{
		if(top<0)
		{
			System.out.println();
			System.out.println("stack is already empty!");
		}
		else
		{
			System.out.println();
			System.out.println("popped " + s[top] + " from top of stack.");
			top--;
		}
	}
	void display()
	{
		if(top == -1)
		{
			System.out.println();
			System.out.println("stack is empty!");
		}
		else
		{
			System.out.println("stack elements are : ");
			int tmp = top;
			while(tmp>-1)
			{
				System.out.println(s[tmp--] + "\t");
			}
		}
	}
}
class Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Stack1 o = new Stack1();
		int choice;
		do
		{
			System.out.println();
			System.out.println("1)push\t 2)pop\t 3)display\t 4)exit");
			System.out.print("enter your choice : ");
			choice = sc.nextInt();
			if(choice == 1)
			{
				o.push();
			}
			else if(choice == 2)
			{
				o.pop();
			}
			else if(choice == 3)
			{
				o.display();
			}
			else{
				break;
			}
		}while(choice != 4);
	}
}