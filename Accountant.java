package practice_inheritance;

public class Accountant extends Employee
{
	String fileName;
		
	public Accountant() 
	{
		super();
	}
	
	public Accountant(String name, int salary)
	{
		super(name,salary);
	}
	public Accountant(String name, int salary, String fileName) 
	{
		super(name,salary);
		this.fileName = fileName;
	}
	public String getFileName() 
	{
		return fileName;
	}
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}
	@Override
	public String toString()
	{
		return "Accountant [fileName=" + fileName + "]";
	}
	
	public void worksOnTaxFile()
	{
		System.out.println("-------------------");
		System.out.println("Enter Your Name:"+name); 
		System.out.println("Enter File Name"+fileName);	
		System.out.println("Enter Salary"+salary);	
		System.out.println("\n");
	}
	
	
}