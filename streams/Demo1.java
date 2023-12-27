package stream.bhanu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(2,4,5,6,78,1,3);
		
		/*
		 * streams are mainly used to data not change perminently we just take the data to tempararely and 
		 * do some chages to do the requirments
		 * 
		 * stream are used only one time
		 */

//		Stream<Integer> st=l.stream();
//		Stream<Integer> sort=st.sorted();
//		sort.forEach(n->System.out.println(n)); 
//		sort.forEach(n->System.out.println(n)); // streams are used only one time after that we get exception
		
		
		Stream<Integer> data=l.stream(); // all list data are store in data variable in stream (dupllicate)
		Stream<Integer> twicedata=data.map(n->n*2); // stream we are adding map method 
		/*
		 * level:1
		 * for(int i: l)
		 * {
		 * System.out.println(n*2)
		 * }
		 * 
		 * Level: 3
		 * 
		 * l.stream().map(n->n*2).foreach(n->System.out.println(n));
		 */
		twicedata.forEach(n->System.out.println(n));
		
		
	}

}
