package second.functional;


import java.util.function.Consumer;


public class AllFunctional1 {
	//*****************************Consumer********************************
private String name;


	public static void main(String[] args) {
//		m1 m=new m1()
//				{
//			public void print() {
//				System.out.println("this is inner class anonymous object creation");
//			}
//				};
//				m.print();
	
		
		//************************************Predicate ************************************

		
		/*Predicate<Integer> p=a -> (a>=0);
		System.out.println(p.test(0));
		System.out.println(p.negate());*/
		//*****************************Consumer********************************
//		Consumer<String> cs=t-> {System.out.println(t);	};
//		cs.accept("bhanu");
		
		Consumer<String> cs1= new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		cs1.accept("bhanu");
	}

}

//***************************Supplier**********************************




//***********************FunctionInterface********************************
@FunctionalInterface
interface m1  {
	void print();
	//void show();
	//public boolean equal (Object obj);
	String toString();
}

//************************************Predicate ************************************

/*class p{
	Predicate<Integer> p= new Predicate<Integer>() {
		
		@Override
		public boolean test(Integer t) {
			if(t>0)
			{
				return true;
			}
			return false;
		}
	};
}

class p{
	int a[]= {1,2,3,4,5,6,7,8,9,0};
}

*/



