
public class Consructor {
	String name;
	String brand;
	double price;
	
		Consructor(String arg1,String arg2,double arg3)
		
		{
			name=arg1;
			brand=arg2;
			price=arg3;
			
			
		}
	

	public static void main(String[] args)
	{
		Consructor p1=new Consructor("cello","nataj",5.6);
		System.out.println(p1.name+","+p1.brand+","+p1.price);
		

	}

}
