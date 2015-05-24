package com.elastica.webpage;

import org.openqa.selenium.By;

import com.elastica.webelements.ButtonElement;
import com.elastica.webelements.HtmlElement;
import com.elastica.webelements.Table;
import com.elastica.webelements.TextFieldElement;

public interface UiLocators {
	    public static final TextFieldElement oneDriveUserNameTextBox = new TextFieldElement("Login Text Box", By.name(DriveLoginUILocators.userNameOneDrive));
	    public static final TextFieldElement oneDrivePasswordTextBox = new TextFieldElement("Password Te  xt Box", By.name(DriveLoginUILocators.passwordOneDrive));
	    public static final ButtonElement 	oneDriveLoginButton = new ButtonElement("Login ButtonElement", By.id(DriveLoginUILocators.signInButtonOneDrive));
	    
	    public static final TextFieldElement boxUserNameTextBox = new TextFieldElement("Login Text Box", By.id(DriveLoginUILocators.userNameBox));
	    public static final TextFieldElement boxPasswordTextBox = new TextFieldElement("Password Te  xt Box", By.id(DriveLoginUILocators.passwordBox));
	    public  static final ButtonElement 	boxLoginButton = new ButtonElement("Login ButtonElement", By.id(DriveLoginUILocators.signInButtonBox));
	    
	    public static final TextFieldElement dropboxUserNameTextBox = new TextFieldElement("Login Text Box", By.cssSelector(DriveLoginUILocators.userNameDropBox));
	    public static final TextFieldElement dropboxPasswordTextBox = new TextFieldElement("Password Te  xt Box", By.cssSelector(DriveLoginUILocators.passwordDropBox));
	    public static final ButtonElement 	dropboxLoginButton = new ButtonElement("Login ButtonElement", By.cssSelector(DriveLoginUILocators.signInButtonDropBox));
	    
	    public static final TextFieldElement gDriveUserNameTextBox = new TextFieldElement("Login Text Box", By.id(DriveLoginUILocators.userNameGDrive));
	    public static final TextFieldElement gDrivePasswordTextBox = new TextFieldElement("Password Te  xt Box", By.id(DriveLoginUILocators.passwordGDrive));
	    public static final ButtonElement 	gDriveLoginButton = new ButtonElement("Login ButtonElement", By.id(DriveLoginUILocators.signInButtonGDrive));
	  
	    public static final Table fileFolder= new Table("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody"));
	    
	    public static final HtmlElement file= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .file"));
	    
	    public static final HtmlElement folder= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .folder"));
	    
	    
	    public static final HtmlElement resourceList= new HtmlElement("This is Table locator", By.cssSelector(".centerColumn .fillTable>table>tbody .c-ListView .child"));
	    
	    
	    
	    
		
	    
	    
	    

}
