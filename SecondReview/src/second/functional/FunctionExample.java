package second.functional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionExample {

	public static  void main(String[] a) {
//		Function<String, Integer> f=new Function<String, Integer>() {
//			
//			@Override
//			public Integer apply(String t) {
//				System.out.println(5);
//				return null;
//			}
//		};
//		f.apply(null);
		
		
//		Supplier<Double> s=()->Math.random();
//		System.out.println(s.get());
//		Predicate<Integer> p=t->(t>=5);
//		System.out.println(p.test(4));
//		
		
//		Consumer<String> c=t-> {System.out.println(t);};
//		
//		c.accept("marolix");
//	}
		
		Function<Integer, Integer> f=(Integer t)-> {	System.out.println(t);
				return null;
			
		};
		
		f.apply(6);
	}
}

//class ab{
//	int t[]= {1,2,3,4,5,0};
//	
//}


//class ba{
//	
//	
//	String name;
//	
//	
//}












