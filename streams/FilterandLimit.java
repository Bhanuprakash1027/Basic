package stream.bhanu;

import java.util.Arrays;
import java.util.List;

public class FilterandLimit {
	
	String name;
	String city;
	double sal;
	int id;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public FilterandLimit(String name, String city, double sal, int id) {
		super();
		this.name = name;
		this.city = city;
		this.sal = sal;
		this.id = id;
	}


	@Override
	public String toString() {
		return "FilterandLimit [name=" + name + ", city=" + city + ", sal=" + sal + ", id=" + id + "]";
	}


	public static void main(String[] args) {
		
		List<FilterandLimit> fl=Arrays.asList(
				new FilterandLimit("srinu","guntur",27000.0,2026),
				new FilterandLimit("Himanth","ongole",25000.0,2020),
				new FilterandLimit("hari","ongole",22000.0,2025),
				new FilterandLimit("pk","martur",37000.0,2006)
				);

		System.out.println();
		fl.stream().filter(FilterandLimit->FilterandLimit.city=="ongole").
		limit(1).
		forEach(System.out::println);;
		
	}

}
