package com.elastica.webpage;

import org.openqa.selenium.By;






import com.elastica.webelements.ButtonElement;
import com.elastica.webelements.HtmlElement;
import com.elastica.webelements.LinkElement;
import com.elastica.webelements.TextFieldElement;

public interface UiLocatorsDriveOperations {
	
	    public static final LinkElement uploadLink = new LinkElement("Login Text Box", By.linkText("Upload"));
	    public static final LinkElement uploadFileLink = new LinkElement("Login Text Box", By.cssSelector(".c-CommandBar .links li:nth-child(2) span span ul li:nth-child(1)"));
	    public static final HtmlElement fileSelectionCheckboxList = new HtmlElement("Login Text Box", By.cssSelector(".centerColumn .fillTable>table>tbody .file .selectArea"));
	    public static final LinkElement shareLink = new LinkElement("Login Text Box", By.linkText("Share"));
	    public static final TextFieldElement emailToShareTextBox = new TextFieldElement("Login Text Box", By.cssSelector(".cp_primaryInput.cp_anyInput.t_urtc"));
	    public static final TextFieldElement quickNoteTextBox = new TextFieldElement("Login Text Box", By.cssSelector(".sd_email_message"));
	    public static final ButtonElement shareButton = new ButtonElement("Login Text Box", By.cssSelector(".sd_email_share.default"));
	    public static final ButtonElement closeButton = new ButtonElement("Login Text Box", By.cssSelector(".sd_done.default"));
	    
	 
	  /*
	    public static final Table fileFolder= new Table("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody"));
	    
	    public static final HtmlElement file= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .file"));
	    
	    public static final HtmlElement folder= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .folder"));
	    
	    
	    public static final HtmlElement resourceList= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .c-ListView .child"));
	    
	    */
	    
	    
		
	    
	    
	    

}
