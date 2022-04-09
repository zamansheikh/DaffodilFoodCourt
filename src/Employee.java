import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee implements Serializable{
    private String name;
	private String empId;
	private double salary;
	public Employee(String name, String empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	//toString method
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
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
	public static void employeeMenu(){
		System.out.println("Employee Menu: ");
		System.out.println("\t1. Add Employee");
		System.out.println("\t2. Remove Employee");
		System.out.println("\t3. Search Employee");
		System.out.println("\t4. Display Employee");
		System.out.println("\t0. Back");
		System.out.print("\tEnter your choice: ");
	}
    // public boolean insert(){
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.println("\tEnter Employee Name\n\t$ ");
	// 	String name = sc.nextLine();
	// 	System.out.println("\tEnter Employee ID\n\t$ ");
	// 	String empId = sc.nextLine();
	// 	System.out.println("\tEnter Employee Salary\n\t$ ");
	// 	double salary = sc.nextDouble();
	// 	sc.nextLine();
	// 	String content = name + "," + empId + "," + salary;
	// 	FileSave.writeA("lib\\Employee.txt", content);
	// 	return true;
	// }
	
	
	
}

