

import java.time.LocalDate;

public class Employee {
	
	//attributes/properties/state/fields/member variables/instance variable
	private int empno;
	private String name;
	private double salary;
	private LocalDate dateOfJoining; // this is a camel casing use this type
	
	// default constructor this helps us to create an object without giving parameters
	public Employee( ) {
		
	}
	 
	// constructor over loading
	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		
	}

	
	/// this is initialising above elements
	// constructor
	


	public Employee(int empno, String name, double salary, LocalDate dateOfJoining) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	public int getEmpno() {
		return empno;
	}



	public void setEmpno(int empno) {    //here we can remove this setter because we will not change empployee no
		this.empno = empno;
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



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	//constructor
	
	

}
