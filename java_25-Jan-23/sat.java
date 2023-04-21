public class sat{
	public static void main(String[] agrs){
		System.out.println("hello world");

}
}

import java.time.LocalDate;
import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object
		
		Employee e1 = new Employee(1001, "Anushree", 25000, LocalDate.of(2023, 1, 23));
		System.out.println( e1.getEmpno() + "," + e1.getName() + "," + e1.getSalary() + "," + e1.getDateOfJoining);

	}

}