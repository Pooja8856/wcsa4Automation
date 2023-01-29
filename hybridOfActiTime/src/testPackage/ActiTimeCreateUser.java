package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class ActiTimeCreateUser extends BaseTest {
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		Flib flib=new Flib();
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
		Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		hp.clickOnUsers();
		UserPage userPage=new UserPage(driver);	
		userPage.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
		userPage.validPass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
		userPage.firstName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 2));
		userPage.lastName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 3));
		userPage.clickOnCreateButton();
		Thread.sleep(2000);
	}

}
