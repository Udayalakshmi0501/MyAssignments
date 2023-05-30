package week4.day2;

public class EmployeeDetails {

	
	public void getEmployeeDetails(String name) {
		System.out.println(name);
	}
	public void getEmployeeDetails(int id) {
		System.out.println(id);	
	}
	public void getEmployeeDetails(String address, int mobileNumber) {
		System.out.println(address +" " + mobileNumber);
	}
	public void getEmployeeDetails( int salary , String district) {
		System.out.println(salary +" " + district);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.getEmployeeDetails(2015879);
		emp.getEmployeeDetails("Udayalakshmi");
		emp.getEmployeeDetails(25000, "Chennai");
		emp.getEmployeeDetails("Chrompet", 1234567890);

	}

}
