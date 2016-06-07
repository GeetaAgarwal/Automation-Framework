package MyAutomation.AutomationFramework;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BasePageTest;
import com.main.HomePage;

public class HomePageTest extends BasePageTest{
	HomePage hp;
	@BeforeClass
	public void initialize() {
		
		hp = new HomePage(driver);
		
	}
	
    @Test
	public void testcounticons(){
		
		int actual = hp.counticons();
		
        assertEquals(6,actual);
	
	}
	@Test
	public void clickWbl(){
		String actual = hp.clickWbl();
		
		assertEquals("http://whitebox-learning.com/", actual);
		
		
	}

}
