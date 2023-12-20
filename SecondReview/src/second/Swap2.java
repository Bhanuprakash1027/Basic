package second;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter First number ");
		int n1=sc.nextInt();
		System.out.println("enter second number ");
		int n2=sc.nextInt();
		System.out.println("before swapping the two numbers "+ n1+" "+ n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swapping the two numbers "+ "n1 =" + n1 +" "+ "n2=" + n2);
	}

}
