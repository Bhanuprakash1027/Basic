package stream.bhanu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {

	public static void main(String[] args) throws IOException {
		List<String> l= Arrays.asList("bhanu","prakash","rajesh");
	//l.stream().map(name->name.length()).forEach(len->System.out.println(len));
	
	Function<String, String> f1=new Function<String, String>() {
		
		@Override
		public String apply(String t) {
			for (String string : l) {
				l.lastIndexOf(string);
			}
			return t;
		}
	};
		f1.apply("bhanu");

	}

}
