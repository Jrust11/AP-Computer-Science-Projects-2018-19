//Name: Jacob Rust
//Project: Student Class




public class student 
{

	private String firstName;
	private String lastName;
	private String address;
	private String dob;
	private int credits;
	private int gradYear;
	private int studentID;
	private double gpa;
	private static int grade;
	
	public student(String f, String l, String ads, String d, int cred, int grad, int ID, double g, int grd)
	{
		firstName = f;
		lastName = l;
		address = ads;
		dob = d;
		credits = cred;
		studentID = ID;
		gpa = g;
		grade = grd;
		gradYear = grad;
	}
	
	public student()
	{
		firstName = "First";
		lastName = "Last";
		address = "Address";
		dob = "01/01/18";
		credits = 0;
		studentID = 1234567;
		gpa = 0.0;
		grade = 9;
		gradYear = 2020;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getDOB()
	{
		return dob;
	}
	public int getCredits()
	{
		return credits;
	}
	public int getgradYear()
	{
		return gradYear;
	}
	public int getstudentID()
	{
		return studentID;
	}
	public double getGPA()
	{
		return gpa;
	}
	public int getGrade()
	{
		if(credits < 6)
		{
			return 9;
		}
		if(credits < 12)
		{
			return 10;
		}
		if( credits < 18)
		{
			return 11;
		}
		return 12;
	}
	
	
	public static void main(String[] args)
	{
		
			
			student a = new student("Jacob"," Rust","Ohio","01/01/18",15,2020,123567,4.6,grade);
		
			student b = new student("David"," Xiong","Ohio","01/01/18",17,2020,1234567,4.8,grade);
		
			System.out.print(a.getfirstName());
		
			System.out.println(a.getlastName());
		
			System.out.println(a.getAddress());
		
			System.out.println(a.getDOB());
		
			System.out.println(a.getgradYear());
		
			System.out.println(a.getstudentID());
		
			System.out.println(a.getGPA());
		
			System.out.println(a.getCredits());
		
			System.out.println(a.getGrade());
			
			System.out.print(b.getfirstName());
		
			System.out.println(b.getlastName());
		
			System.out.println(b.getAddress());
		
			System.out.println(b.getDOB());
		
			System.out.println(b.getgradYear());
		
			System.out.println(b.getstudentID());
		
			System.out.println(b.getGPA());
		
			System.out.println(b.getCredits());
		
			System.out.println(b.getGrade());
			
			
	}
	
	
	
}
