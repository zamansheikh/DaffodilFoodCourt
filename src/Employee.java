import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private String name;
	private String empId;
	private double salary;
	public Employee(String name, String empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	public String getEmpId()
	{
		return empId;
	} 
	public double getSalary()
	{
		return salary;
	}
    public boolean insert(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\tEnter Employee Name\n\t$ ");
		String name = sc.nextLine();
		System.out.println("\tEnter Employee ID\n\t$ ");
		String empId = sc.nextLine();
		System.out.println("\tEnter Employee Salary\n\t$ ");
		double salary = sc.nextDouble();
		sc.nextLine();
		String content = name + "," + empId + "," + salary;
		FileSave.writeA("lib\\Employee.txt", content);
		return true;
	}
	public boolean view(){
		String content = FileSave.read("lib\\Employee.txt", new ArrayList<String>());
		String[] lines = content.split("\n");
		for(int i = 0; i < lines.length; i++){
			String[] data = lines[i].split(",");
			System.out.println("\tName: " + data[0]);
			System.out.println("\tID: " + data[1]);
			System.out.println("\tSalary: " + data[2]);
		}
		return true;
	}
}

