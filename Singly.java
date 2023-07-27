import java.util.*;
class Node
{
	Scanner sc = new Scanner(System.in);
	int data;
	Node next;
	Node()
	{
		data = 0;
		next = null;
	}
	Node(int val)
	{
		data = val;
		next = null;
	}

	void append(Node new_node)
	{
		this.next = new_node;
	}
	void insert(int val)
	{
		Node new_node;
		System.out.print("enter the value for the new node : ");
		new_node.data = sc.nextInt();
		Node head = this;
		while(head.data != val)
		{
			head = head.next;
		}
		new_node.next = head.next;
		head.next = new_node;
	}
	void display()
	{
		Node head = this;
		System.out.println("list elements are : ");
		while(head != null)
		{
			System.out.print(head.data + "\t");
			head = head.next;
		}
	}

}
class Singly
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Node n[] = new Node[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("enter the value : ");
			int val = sc.nextInt();
			n[i] = new Node(val);
			if(i>0)
				n[i-1].append(n[i]);
		}
		n[0].display();
	}
}