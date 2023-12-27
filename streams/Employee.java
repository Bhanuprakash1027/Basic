package stream.bhanu;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Employee {
	
	String name;
	int id;
	int sal;
	
	

	public Employee(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public Employee() {
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public static void main(String[] args)
	{
		//***********************print all emp details***********************************
		List<Employee> employees= Arrays.asList(
				new Employee("bhanu",10,10000),
				new Employee("prakash",11,15000),
				new Employee("rajesh", 1, 50000)
				);
		
		employees.stream().
		sorted().
		
		equals(employees);
		System.out.println(employees);
		System.out.println();
		
		//***********************Filter method***********************************
		System.out.println("this is filter :");
		employees.stream().filter(Employees->Employees.sal>10000).forEach(System.out::println);
		
		//***********************limit method***********************************
		System.out.println("this is limt:");
		employees.stream().limit(1).forEach(System.out::println);
		
		//***********************map method***********************************
		System.out.println("this is map:");
		employees.stream().map(Employees->Employees.getName()).forEach(System.out::println);	
		
		
		System.out.println("Distanct and sort");
		employees.stream().distinct() .forEach(System.out::println);
		
		employees.stream(). forEach(System.out::println);	
		
	}

}


