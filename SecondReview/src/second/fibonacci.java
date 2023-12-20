package second;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		
		
		//***********************************************************************
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a target  number");
//		int n1=0,n2=1,n3;
//		n3=sc.nextInt();
//		if(n3>0) {
//		
//		for(int i=n3;i>=0;i--) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			
//			System.out.println(n3);
//		}
//		}
//		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int x=sc.nextInt();
		int n1=0,n2=1,n3;
		while(x>=0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		x--;
		}
	}

}
