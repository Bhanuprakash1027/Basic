package second;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		boolean b=false;
		for(int i=2;i<=n/i;++i)
		{
			if(n%i==0)
			{
				b=true;
				break;
			}
		}
		if(!b)
		{
			System.out.println(n + " given number is prime number");
		}
		else
		{
			System.out.println(n + " given number is not a prime number");
		}
		
		int x=2;
		System.out.println(++x);
	}

}
