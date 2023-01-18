


/*constructor overloading prrogram*/

public class Pen {
	
	int i=20;
	Pen(){
		System.out.println("non parameterized constructor");
	}
	Pen(String s,String s1)
	{
		System.out.println("parameterised constructor");
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		Pen p1=new Pen();
		Pen p2=new Pen("red","blue");
		System.out.println(p1.i);
	}

	
}
