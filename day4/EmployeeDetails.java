package week1.day4;

public class EmployeeDetails {
	
	public void getEmployeeName(String empName) {
		System.out.println("empName: " +empName);
	}
	public void getEmployeeID(int empID) {
		System.out.println("empID: " +empID);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress:" +empAddress);
	}
	public void getEmployeeSalary(double empSalary) {
		System.out.println("empSalary: " +empSalary);
	}
	public void getEmployeeMobileNumber(long empMobNum) {
		System.out.println("empMobNum: "+empMobNum);
	}

	public static void main(String[] args) {
		EmployeeDetails udaya=new EmployeeDetails();
		udaya.getEmployeeName("Udayalakshmi");
		udaya.getEmployeeID(30156);
		udaya.getEmployeeAddress("Trunelveli");
		udaya.getEmployeeSalary(55236.890);
		udaya.getEmployeeMobileNumber(9587426987L);

	}

}
