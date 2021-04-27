package entities;

public class Employee_listas {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee_listas(){
	}
	public Employee_listas(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
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
	public double getSalary() {
		return salary;
	}
}
