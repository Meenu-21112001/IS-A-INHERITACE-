package practice_inheritance;

public class HRDetails extends Employee
{
	String employeestartdate;
	 String employeebankdetails;
	 String employeelocation;
	 
	 public HRDetails()
		{
		super();
	   }
	 
     public HRDetails(String employeestartdate, String employeebankdetails, String employeelocation) 
       {
		super();
		this.employeestartdate = employeestartdate;
		this.employeebankdetails = employeebankdetails;
		this.employeelocation = employeelocation;
	  }

	public HRDetails(String name,int salary,String employeestartdate, String employeebankdetails, String employeelocation)
	{
		super();
		this.name=name;
		this.salary=salary;
		this.employeestartdate = employeestartdate;
		this.employeebankdetails = employeebankdetails;
		this.employeelocation = employeelocation;
	}
	
	public String getEmployeestartdate()
	{
			return employeestartdate;
	}
		
	
	public void setEmployeestartdate(String employeestartdate) {
		this.employeestartdate = employeestartdate;
	}
	public String getEmployeebankdetails()
	{
		return employeebankdetails;
	}
	public void setEmployeebankdetails(String employeebankdetails) {
		this.employeebankdetails = employeebankdetails;
	}
	public String getEmployeelocation() {
		return employeelocation;
	}
	public void setEmployeelocation(String employeelocation) {
		this.employeelocation = employeelocation;
	}
   public void Details()
   {
	   System.out.println("----------------------------------");
	   System.out.println("Enter Employee Name :"+name);
	   System.out.println("Enter Employee Salary :"+salary);
	   System.out.println("Enter Employee Date Of Joining :"+employeestartdate);
	   System.out.println("Enter Employee BankDetails:"+employeebankdetails);
	   System.out.println("Enter Employee Location :"+employeelocation);
   }
   public void Salary(int incentive)
	{
		int previousAmount=super.getSalary();
		super.setSalary(super.getSalary()+incentive);
	}
 
}
