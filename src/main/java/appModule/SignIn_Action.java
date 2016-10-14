package appModule;

import org.openqa.selenium.WebDriver; 
import pageObjects.Home_Page; 
import pageObjects.LogIn_Page;
import utility.*;

 
 public class SignIn_Action {

	public static void Execute(WebDriver driver,String sUsername, String sPassword)throws Exception{    
		Home_Page.lnk_MyAccount(driver).click();
        Log.info("Click action performed on My Account link");
     	
        
        LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);
        //Log.info("Username entered in the Username text box");
        
		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);		
       // Log.info("Password entered in the Password text box");
		
		//Utility.waitForClickable(LogIn_Page.btn_LogIn(driver));
		//Utility.doubleClick(LogIn_Page.btn_LogIn(driver));
		Thread.sleep(1000);
        LogIn_Page.btn_LogIn(driver).click();
        
	    //Log.info("Login button clicked");
        
     }


     
}