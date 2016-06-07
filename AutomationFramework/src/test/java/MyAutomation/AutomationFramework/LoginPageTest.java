package MyAutomation.AutomationFramework;

import org.testng.Assert;

import com.base.BasePageTest;
import com.main.HomePage;
import com.main.LoginPage;

public class LoginPageTest extends BasePageTest{
	
	LoginPage lp;
	
	HomePage hp;
	
	public void start() {
		hp = new HomePage(driver);
		hp.clickLogin();
		lp = new LoginPage(driver);
    }
    
	
	public void testdologin() {
		String errString = lp.dologin("mymy", "badpwd");
		
		Assert.assertEquals("Username and Password are wrong...Please try again.",errString);


		
	}
}
