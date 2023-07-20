import java.util.*;
class ObjArray
{
	public static void main(String args[])
	{
		Demo o[] = new Demo[3];

		for(int i=0;i<3;i++)
		{
			o[i] = new Demo(i,i);
			System.out.println("a = " + o[i].a + " b = " + o[i].b);
		}
	}
}

class Demo
{
	int a,b;
	Demo(int i,int j)
	{
		a=i*2;
		b=j/2;
	}
}