package appModule;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver; 

import pageObjects.*; 
import utility.*;

 
 public class Logout_Action {

	 @SuppressWarnings("unused")
	private static final TimeUnit SECONDS = null;

	public static void accVerify(WebDriver driver)throws Exception{    
    	 
		String Account_Name = Shift_Form.txt_MyAccount(driver).getText();
		System.out.println(Account_Name);
        Log.info("Account name identification performed");
      
        Thread.sleep(1000);
        Shift_Form.lnk_Logout(driver).click();

          Log.info("Logout img clicked");
          
          System.out.println("Done");
        
     }

     
}