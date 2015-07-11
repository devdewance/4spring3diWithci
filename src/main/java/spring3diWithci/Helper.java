package spring3diWithci;

public class Helper {

	
	private DbService dbService;
	
	
	
	
	public Helper(DbService dbService) {
		this.dbService=dbService;
	}
	
	
	public boolean checkValidEmployee(int Employeeid)
	{
		return dbService.checkValidEmployee(Employeeid);
	
		
		
	}
	public boolean chengePassOfEmp(int empid, String newPass,String oldPass)
	{
		
		
		return dbService.chengePassOfEmp(empid, newPass, oldPass);
		
		
	}
}
