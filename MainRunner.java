package practice_inheritance;


public class MainRunner
{
	public static void main(String args[])
	{
	
			
			
			Accountant accountant=new Accountant("Meenu", 20000, "TaxFile");
			accountant.worksOnTaxFile();
			
			Project twitter=new Project("Content Writter", 15);//Creating object for project class to Access things in that
			
			Developer developer=new Developer(twitter, "Beta", "Lachu",15000);
			developer.worksOnProject();
			
			Marketing_Manager mm=new Marketing_Manager("tenu",2357,"mehalaya",10);
			mm.Records();
			
			HRDetails hrd=new HRDetails("annam",30000,"21jan2022","hdfc","shimla");
			hrd.Details();
			hrd.Salary(900);
			int ss=hrd.getSalary();
			System.out.println(ss);
			
			Manager m=new Manager();
			
			m.Salary(3000);
			int s=m.getSalary();
			System.out.println(s);
			
			
			m.setMedicalinsurance(0);
			int s1=m.getMedicalInsurance();
			System.out.println(s1);
		}
		
	}


