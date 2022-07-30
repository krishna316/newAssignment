package kelltonTechAssigment;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	private int id;
	private String name;
	private int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class streamEmp {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1,"krishna",24));
		emp.add(new Employee(2,"sandip",26));
		emp.add(new Employee(3,"rushikesh",36));
		emp.add(new Employee(4,"bapu",34));
		emp.add(new Employee(5,"Amar",23));
		emp.add(new Employee(6,"yogesh",44));
		
		
		int youngeremployee = emp.stream().map(Employee::getAge).min(Integer::compare).get();
		System.out.println("Youngest Employee" +youngeremployee);
		emp.stream().filter(emp1->emp1.getAge()==youngeremployee).forEach(System.out::println);
		
		int Elderemployee = emp.stream().map(Employee::getAge).max(Integer::compare).get();
		System.out.println("Elder Employee" +Elderemployee);
		emp.stream().filter(emp2->emp2.getAge()==Elderemployee).forEach(System.out::println);

	}

}
