package com.elastica.webpage;

import com.elastica.dataobject.User;
import com.elastica.webelements.BasePage;

public class DriveAction extends BasePage implements UiLocators, UiLocatorsDriveOperations {
	
	//DriveLoginPage tlp;
	
	 public void driveLogin(String driveName, User user) throws Exception{
		 DriveLoginPage	 tlp= new DriveLoginPage(driveName);
	    	
	    	tlp.loginToDrive(user);
	    	Thread.sleep(8000);
	    	
	    
	    }
	
	
	 public void clickUplaodLink(){
		uploadLink.click();
		 System.out.println(uploadFileLink.getElement());
		 System.out.println(uploadFileLink.isDisplayed());
		 System.out.println(uploadFileLink.isElementPresent());
		 uploadFileLink.click();
	 }
	 
	 public  void clickFileCheckbox(int index){
	    	System.out.println("Checkbox: "+fileSelectionCheckboxList.isDisplayed());
	    	System.out.println("Checkbox: "+fileSelectionCheckboxList.getAllElements().get(index).isDisplayed());
	    	fileSelectionCheckboxList.getAllElements().get(index).click();
	    	
	    }
	 
	 public  void clickSherLink(){
	    	System.out.println("share link: "+shareLink.isDisplayed());
	    	System.out.println("share link: "+shareLink.isDisplayed());
	    	shareLink.click();
	    	
	    }
	 
	 
	 public  void clickCloseButton(){
	    	System.out.println("close button: "+closeButton.isDisplayed());
	    	System.out.println("close button: "+closeButton.isDisplayed());
	    	closeButton.click();
	    	
	    }
	 
	 
	 
	 public  void clickShareButton(){
	    	System.out.println("share button: "+shareButton.isDisplayed());
	    	System.out.println("share button: "+shareButton.isDisplayed());
	    	shareButton.click();
	    	
	    }
	 
	 
	 public  void typeInEmailTo(String email){
	    	System.out.println("email field: "+emailToShareTextBox.isDisplayed());
	    	System.out.println("email field: "+emailToShareTextBox.isDisplayed());
	    	emailToShareTextBox.type(email);
	    	
	    }
	 
	 public  void typeInQuickNote(String msg){
	    	System.out.println("quick note: "+quickNoteTextBox.isDisplayed());
	    	System.out.println("quick note: "+quickNoteTextBox.isDisplayed());
	    	quickNoteTextBox.type(msg);
	    	
	    }
	 
	 
	 
	 public  void getListFiles(){
	    	System.out.println("Row: "+fileFolder.getRowCount());
	    	
	    }
	 
	 public void getFolderList(){
		 System.out.println("Folder: "+folder.getAllElements().size()/2); 
	 }
	 
	 public void getFileList(){
		 System.out.println("Files: "+file.getAllElements().size()); 
	 }
	 
	 public void getAllResourceListSize(){
		 System.out.println("All resource list: "+(resourceList.getAllElements().size()-2)); 
	 }

	 public void logout(){
		 if (getDriver()!=null)
		 getDriver().get("https://login.live.com/logout.srf");
	 }
	 
	@Override
	protected void capturePageSnapshot() {
		// TODO Auto-generated method stub
		
	}
}
