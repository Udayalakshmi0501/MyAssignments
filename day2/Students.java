package week4.day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id , String name) {
		System.out.println(id + " , " + name);
	}
	public void getStudentInfo(String emailId , long phoneNumber) {
		System.out.println(emailId + " , " + phoneNumber  );
	}

	public static void main(String[] args) {
	
		Students student = new Students();
		student.getStudentInfo(2017309045);
		student.getStudentInfo(2017309045, "Udayalakshmi");
		student.getStudentInfo("udayalakshmi0501@gmail.com", 9790356890l);
	}

}
