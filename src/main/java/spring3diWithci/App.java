package spring3diWithci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
		public static void main(String[] args) {
				
			ApplicationContext context= new  ClassPathXmlApplicationContext("beans.xml");
			Helper db =(Helper)context.getBean("serv");
			System.out.println(db.checkValidEmployee(12345));
			System.out.println(db.chengePassOfEmp(1234, "imsecure", "imnotsecire"));
			
			
			
			
			
		}
}
