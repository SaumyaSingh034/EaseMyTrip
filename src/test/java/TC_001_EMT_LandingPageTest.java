import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easemytrip.qa.pages.EMT_LandingPage;

import baseClass.Base;

public class TC_001_EMT_LandingPageTest extends Base {
	
	EMT_LandingPage lp;
	
	public TC_001_EMT_LandingPageTest()
	{
		super();
		lp = new EMT_LandingPage();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initializeBrowser();
	}
	
	@Test(priority=0)
	public void validateTitle()
	{
		String title = lp.getTitleofPage();
		System.out.println(title);
	}

}
