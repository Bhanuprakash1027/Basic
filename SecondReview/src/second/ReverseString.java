package second;

public class ReverseString {

	public static void main(String[] args) throws Exception{
//		 String str="marolix";
//		 String reverce=" ";
//		 for(int i=str.length();i>=0;i--)
//		 {
//			 reverce=reverce+str.charAt(i);
//		 }
//		 System.out.println(reverce);
		
		
		String name="bhanu prakash";
		String rev=" ";
		for(int i=name.length();i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
