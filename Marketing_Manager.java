package practice_inheritance;

public class Marketing_Manager  extends Employee
{
	String location;
	int target;
	
	public Marketing_Manager()
	{
		super();
	}

	public Marketing_Manager(String name,int salary,String location, int target)
	{
		super();
		this.name=name;
		this.salary=salary;
		this.location = location;
		this.target = target;
	}

	public Marketing_Manager(String location, int target) 
	{
		super();
		this.location = location;
		this.target = target;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Marketing_Manager [location=" + location + ", target=" + target + "]";
	}
	
	public void Records()
	{
		System.out.println("---------------------------");
		System.out.println("Enter Employee Name  :"+name);
		System.out.println("Enter Employee Salary  :"+salary);
		System.out.println("Enter Employee Location  :"+location);
		System.out.println("Enter TargetAsset :"+target);
		
	}
	
	

}
