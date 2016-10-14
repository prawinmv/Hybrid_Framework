package automationFramework;
 
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModule.*;
import utility.*;

public class PageObjectModel  {

	
	private static WebDriver driver = null;

@BeforeTest
public void browserSetUp() throws Exception {

	
	    DOMConfigurator.configure("log4j.xml");
	    //String browser = Utility.getProperty("ObjectRepo.properties","Browser");
		//Utility.openBrowser(browser);
	    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	    driver = new FirefoxDriver();
	    Log.info("New driver instantiated");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    System.out.println("Firefox is invoked successfully");
	    driver.get(Constant.URL);
		
	// Launch the Online Store Website using Constant Variable		
}
//(dataProvider="Data",dataProviderClass=Dataprovider.class)
@Test(priority = 0)
public void loginMethod() throws Exception {
	
	SignIn_Action.Execute(driver, Constant.Username,Constant.Password);
      Log.info("Login Successfully performed");
           
    }

@Test(priority = 1)
public void accountVerifyMethod() throws Exception {
	
	Logout_Action.accVerify(driver);;
      Log.info("Logout Successfully performed");
           
    }

@AfterTest
public void tearDown()
{
	 //driver.quit();
    Log.info("Browser closed");
	System.out.println("End of Script");
	
//driver.quit();
}
}