/*
 * Copyright 2015 www.seleniumtests.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elastica.tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.elastica.core.Filter;
import com.elastica.core.SeleniumTestPlan;
import com.elastica.dataobject.User;
import com.elastica.util.SpreadSheetHelper;
import com.elastica.util.internal.entity.TestEntity;
import com.elastica.webpage.DriveAction;
import com.elastica.webpage.DriveLoginPage;


public class OneDriveOperations extends SeleniumTestPlan {

    @DataProvider(name = "loginData", parallel = true)
    public static Iterator<Object[]> getUserInfo(final Method m, final ITestContext testContext) throws Exception {
        Filter filter = Filter.equalsIgnoreCase(TestEntity.TEST_METHOD, m.getName());

        LinkedHashMap<String, Class<?>> classMap = new LinkedHashMap<String, Class<?>>();
        classMap.put("TestEntity", TestEntity.class);
        classMap.put("User", User.class);

        return SpreadSheetHelper.getEntitiesFromSpreadsheet(OneDriveOperations.class, classMap, "loginuser.csv", 0, null,
                filter);
    }

    /**
     * Logs in to TestLink as valid user.
     *
     * @param   testEntity
     * @param   user
     *
     * @throws  Exception
     */
    @Test(groups = {"oneDrive"}, dataProvider = "loginData", description ="one Drive")
    public void loginAsValidUser(final TestEntity testEntity, final User user) throws Exception {
    	DriveAction da= new DriveAction();
    	
    	user.setUserID("*******@hotmail.com");
    //	user.setUserID("elastictest2");
    	user.setPassword("*******");
    	
    	da.driveLogin("onedrive", user);
    	da.getListFiles();
    	da.getFolderList();
    	da.getFileList();
    	da.clickFileCheckbox(0);
    	da.clickSherLink();
    	da.typeInEmailTo("****@gmail.com");
    	da.typeInQuickNote("This is for you");
    	da.clickShareButton();
    	da.clickCloseButton();
    	//da.clickUplaodLink();
    	Thread.sleep(20000);
    	//da.getAllResourceListSize();
    	da.logout();
    	//driveLogin("box", user);
    	//driveLogin("dropbox", user);
    	
    	//user.setUserID("elastictest2");
        	//user.setPassword("Test12!@");
        //	driveLogin("gdrive", user);
        	
        	//getFileList();
    	//ap.verifyDocumentationDropDown();
    }
    
    
   /* public void driveLogin(String driveName, User user) throws Exception{
    	
    	DriveLoginPage tlp= new DriveLoginPage(driveName);
    	tlp.loginToDrive(user);
    	Thread.sleep(8000);
    	
    
    }
    
    
 public void getFilelist() throws Exception{
    
	 DriveAction da= new DriveAction();
	 da.getListFiles();
    	
    }
    */
    
  
}
