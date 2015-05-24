
package com.elastica.webpage;

import org.openqa.selenium.By;

import com.elastica.core.CustomAssertion;
import com.elastica.dataobject.User;
import com.elastica.webelements.ButtonElement;
import com.elastica.webelements.LinkElement;
import com.elastica.webelements.PageObject;
import com.elastica.webelements.TextFieldElement;

/**
 * Defines service for TestLink login page.
 *
 * <p/>Date: 10/2/13 Time: 6:15 PM
 */
public class DriveLoginPage extends PageObject implements UiLocators {
	
	DriveAction driveAction  = new DriveAction();
	
    public DriveLoginPage() throws Exception {
    }

    /**
     * Opens log in page.
     *
     * @param   openPageUrl
     *
     * @throws  Exception
     */
    
   
    
    
    public DriveLoginPage(final String drivename) throws Exception {
    	super(DriveLoginUILocators.getDriveUrl(drivename) , true);
    }

  

    /**
     * Logging in with valid credentials direct user to home page.
     *
     * @param   user
     *
     * @return
     *
     * @throws  Exception
     */
    public void loginToDrive(final User user) throws Exception {
    		Thread.sleep(5000);
    		switch (DriveLoginUILocators.driveTypeThis){
    			case ONEDRIVE:
			   System.out.println("One Drive Selected");
			   oneDriveUserNameTextBox.clear();
			   oneDriveUserNameTextBox.sendKeys(user.getUserID());
			   oneDrivePasswordTextBox.clear();
			   oneDrivePasswordTextBox.sendKeys(user.getPassword());
			   
			   oneDriveLoginButton.click();
			   
		     // System.out.println("login Title: "+driver.getTitle());
		     // driver.get("https://login.live.com/logout.srf");
		     // System.out.println("logout title: "+driver.getTitle());
		   
			break;
				
		case BOX:
		      System.out.println("Box Drive Selected");
		      
		      	boxUserNameTextBox.clear();
			   boxUserNameTextBox.sendKeys(user.getUserID());
			   boxPasswordTextBox.clear();
			   boxPasswordTextBox.sendKeys(user.getPassword());
			   boxLoginButton.click();
		      
		      
		      System.out.println("login Title: "+driver.getTitle());
		      driver.get("https://app.box.com/logout/");
		      System.out.println("logout title: "+driver.getTitle());
			System.out.println("Box Selected");
		break;
				
		case DROPBOX:
		      System.out.println("Drop box Drive Selected");
		      
		      dropboxUserNameTextBox.clear();
			   dropboxUserNameTextBox.sendKeys(user.getUserID());
			   dropboxPasswordTextBox.clear();
			   dropboxPasswordTextBox.sendKeys(user.getPassword());
			   dropboxLoginButton.click();
		      
		      
		      
		      Thread.sleep(8000);
		
		      System.out.println("login Title: "+driver.getTitle());
		      driver.get("https://www.dropbox.com/logout");
		      System.out.println("logout title: "+driver.getTitle());
			break;
		case GDRIVE:
		      System.out.println("G Drive Selected");
		      
		      gDriveUserNameTextBox.clear();
			   gDriveUserNameTextBox.sendKeys(user.getUserID());
			   gDrivePasswordTextBox.clear();
			   gDrivePasswordTextBox.sendKeys(user.getPassword());
			   gDriveLoginButton.click();
			   
		      
			      System.out.println("login Title: "+driver.getTitle());
			      driver.get("https://accounts.google.com/Logout?service=wise");
			      System.out.println("logout title: "+driver.getTitle());
			
		break;
		
		}
    	
    }
    
    
   

    /**
     * Logging in with invalid credentials keeps user on login page.
     *
     * @param   user
     *
     * @return
     *
     * @throws  Exception
     */
    public DriveLoginPage loginAsInvalidUser(final User user) throws Exception {
     /*   loginTextBox.clear();
        loginTextBox.sendKeys(user.getUserID());
        passwordTextBox.clear();
        passwordTextBox.sendKeys(user.getPassword());
        loginButton.submit();
        getDriver().switchTo().defaultContent();*/
        return this;
    }

    public DriveLoginPage verifyLoginBoxPresence() {
        getDriver().switchTo().frame(getDriver().findElement(By.id("")));
        /*CustomAssertion.assertTrue(isElementPresent(loginTextBox.getBy()),
            "Invalid credentials don't block user from logging in");*/
        return this;
    }
}
