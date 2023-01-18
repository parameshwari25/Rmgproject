
public class ThisKeyword {
	int rollno;
	String name;
	ThisKeyword(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public void details()
	{
		this.fly();
		System.out.println(rollno);
	}
	public void fly() 
	{
		System.out.println(name);

	}
	public static void main(String[] args)
	{
		ThisKeyword t1=new ThisKeyword(101,"Muhil");
		t1.details();
		  s
		
	}
	

}
