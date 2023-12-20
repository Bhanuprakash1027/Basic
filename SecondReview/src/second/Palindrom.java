package second;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1=sc.nextInt();
//		int rev, sum=0;
//		int temp=n1;
//		
//		while(n1>0) {
//			rev=n1%10;
//			sum=(sum*10)+rev;
//			n1=n1/10;
//		}
//		
//		if(temp==sum) {
//		System.out.println("Given number is  palindrom "+ sum);
//		}else
//		{
//			System.out.println("Given number is not a palindrom "+ sum);
//		}
//		
		
		int rev,sum=0, temp=n1;
		while(n1>0) {
			rev=n1%10;
			sum=(sum*10)+rev;
			n1=n1/10;
		}
		if(temp==sum) {
			System.out.println("given number is pallindorm "+ sum);
		}else
		{
			System.out.println(" given number is not palidnrom and number reversed "+ sum);
		}
		
	}

}
