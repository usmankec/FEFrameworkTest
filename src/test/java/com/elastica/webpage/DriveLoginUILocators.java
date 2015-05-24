package com.elastica.webpage;



public class DriveLoginUILocators {
	public static DriveType driveTypeThis;	
	public static String drivename="";
	public enum DriveType {
		ONEDRIVE, BOX, DROPBOX, GDRIVE
	}
	  
	 	private static final String ONEDRIVE_PAGE_URL = "https://onedrive.live.com/?gologin=1";
	 	//private static final String ONEDRIVE_PAGE_URL = "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=12&ct=1431424201&rver=6.4.6456.0&wp=MBI_SSL_SHARED&wreply=https:%2F%2Fonedrive.live.com%3Fgologin%3D1%26mkt%3Den-US&lc=1033&id=250206&cbcxt=sky&mkt=en-US";
	    private static final String BOX_PAGE_URL = "https://app.box.com/login/";
	    private static final String DROPBOX_PAGE_URL = "https://dropbox.com/login/";
	    private static final String GDRIVE_PAGE_URL = "https://drive.google.com/drive/my-drive";

	public final static String userNameOneDrive="login";
	public final static String passwordOneDrive="passwd";
	public final static String signInButtonOneDrive="idSIButton9";
	
	public final static String userNameBox="login";
	public final static String passwordBox="password";
	public final static String signInButtonBox="continue";
	
	
	
	public final static String userNameDropBox=".login-form .login-text-input .autofocus";
	public final static String passwordDropBox=".login-form .login-password .password-input";
	public final static String signInButtonDropBox=".login-form .clearfix>button";
	/*
	public final static String userNameDropBox=".login-form>div:nth-child(4)>div:nth-child(2)>input";
	public final static String passwordDropBox=".login-form>div:nth-child(5)>div:nth-child(2)>input";
	public final static String signInButtonDropBox=".login-form>div>button>div:nth-child(1)";
	*/
	public final static String userNameGDrive= "Email";
	public final static String passwordGDrive="Passwd";
	public final static String signInButtonGDrive="signIn";
	
	 public static String getDriveUrl(String driveName){
		 	drivename=driveName;
	    	System.out.println("Login to Drive: "+driveName);
	    	driveTypeThis= DriveType.valueOf(driveName.toUpperCase());
			String driveUrl="";
			switch(driveTypeThis){
			case ONEDRIVE:
				driveUrl=ONEDRIVE_PAGE_URL;
				break;
			case BOX:
				driveUrl=BOX_PAGE_URL;
				break;
			case DROPBOX:
				driveUrl=DROPBOX_PAGE_URL;
				break;
			case GDRIVE:
				driveUrl=GDRIVE_PAGE_URL;
				break;
			}
			return driveUrl;
			
	    }
	    
	 public static DriveType driveType(){
	    	System.out.println("Login to Drive: "+drivename);
	    	driveTypeThis= DriveType.valueOf(drivename.toUpperCase());
			return driveTypeThis;
	
	 }
	
}
