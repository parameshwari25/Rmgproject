import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int sum=0,r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palidrome");
	
		
	}

}
