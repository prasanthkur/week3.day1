package week3.day1;

public class Students {

	public void getStudentinfo(int id)
	{
		System.out.println("Student id is "+id);
		
	}
	public void getStudentinfo(int id,String name)
	{
		System.out.println("student id is " +id);
		System.out.println("Student name is "+name);
	}
	public void getStudentinfo(String email, long phoneno)
	{
		System.out.println("Student email is "+ email);
		System.out.println("Student phone no is "+ phoneno);
	}
	
	public static void main(String[] args) {
		
		Students stud=new Students();
		stud.getStudentinfo(1415);
		stud.getStudentinfo(15765, "Sherlock");
		stud.getStudentinfo("Sherlock2GMAIL.COM",982345678);
		
	}
}
