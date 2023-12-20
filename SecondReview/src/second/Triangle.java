package second;

public class Triangle {

	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print(" "+"*");
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}   Left angle Triangle

		/*for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+"*");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}*/ //left down
		
		
		//*********************
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" " +"*");
			}
			System.out.println();
		}// Triangle
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}// Triangle
		
		
		
		for(int i=0;i<=5;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		//
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
			System.out.print("*");
			}
			System.out.println(" ");
		}
		
		// 
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+"*");
			}
			System.out.println(" ");
		}
	}

}
