package Test;

import org.testng.annotations.Test;

import Base.base;


public class Test1 extends base {


	@Test(priority = 0)
	public void Login() {
		hpHome.getLogin().click();
		lplogin.Login(username, password);

	}
	
	@Test(priority = 1)
	public void Register() {
		
		hpHome.getRegister().click();
		lplogin.getLoginbtn().click();
		rpRegister.Details(username , password);
	}

}