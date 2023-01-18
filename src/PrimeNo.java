import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				System.out.println("enter the no");
				int count=0;
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
						count++;
							}
				if(count==2)
					System.out.println("its a prime no");
				else
					System.out.println("not a prime no");
	}

}
