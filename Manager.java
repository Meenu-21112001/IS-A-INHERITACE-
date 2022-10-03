package practice_inheritance;

public class Manager extends Employee
{
	
	/*System.out.println(Employee.name);
	System.out.println(salary);*/
	public void Salary(int incentive)
	{
		super.setSalary(super.getSalary()+incentive);
	}
  public void setMedicalinsurance(int medicalInsurance)
  {      
     
        super.setMedicalInsurance(super.getSalary()+(getSalary()*100));
            
  }
}
