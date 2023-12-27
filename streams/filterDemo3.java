package stream.bhanu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class filterDemo3 {

	public static void main(String[] args) {
		List<Integer> data= Arrays.asList(1,3,5,7,9,2,4,6,8);
		
		Stream<Integer> ex= data.stream();
		Stream<Integer> filter=ex.filter(n->n%2==0); 
		//*******************predicate******************************
		/*Predicate<Integer> p=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t%2==1)
				{
					return true;
				}else
				return false;
			}
		};
		p.test(5);*/
		//***************************************************************
		filter.forEach(n->System.out.println(n));
	}

}
