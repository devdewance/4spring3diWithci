package spring3diWithci;

public class DbSericeImpl implements DbService
{

	@Override
	public boolean checkValidEmployee(int Employeeid) {
		
		System.out.println("Employee checked succefully ");
		return true;
	}

	@Override
	public boolean chengePassOfEmp(int empid, String newPass, String oldPass) {
		System.out.println("password hass been changed");
		return true;
	}
	
	

}
