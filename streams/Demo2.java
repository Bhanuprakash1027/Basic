package stream.bhanu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> ex=Arrays.asList(3,5,7,9,1,2,4,6,8,0);
		// now above list is perminant sotage we need to do changes take strem to do 
		
		Stream<Integer> data=ex.stream(); // this is list data added to stream
		Stream<Integer> sort=data.sorted();
		Stream<Integer> find=sort.map(n->n*2); // this is all the data going to multiple by 2
		
//		Function<Integer,	Integer> f1=new Function<Integer, Integer>() {
//			
//			@Override
//			public Integer apply(Integer t) {
//				System.out.println(t*2);
//				return null;
//			}
//		};
//		f1.apply(2);
		find.forEach(n->System.out.println(n));
		
	}

}
