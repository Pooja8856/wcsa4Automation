package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath="//div[@class='label' and (.='Users')]")private WebElement usersTab;
	@FindBy(xpath="//input[@type='button' and (@value='Create New User')]") private WebElement createUser;
	@FindBy(name="username") private WebElement usnTextBox;
	@FindBy(name="passwordText") private WebElement passTextBox;
	@FindBy(name="passwordTextRetype") private WebElement retypePassTextBox;
	@FindBy(name="firstName") private WebElement firstNameTextBox;
	@FindBy(name="lastName") private WebElement lastNameTextBox;
	@FindBy(xpath="//input[@type='submit' and (.='')]") private WebElement createUserButton;
	@FindBy(xpath="//input[@type='button' and (@value='      Cancel      ')]") private WebElement cancelButton;
	
	public UserPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsersTab() {
		return usersTab;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getUsnTextBox() {
		return usnTextBox;
	}

	public WebElement getPassTextBox() {
		return passTextBox;
	}

	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	//operational method
	public void validUsn(String validUser)
	{
		usnTextBox.sendKeys(validUser);
	}
	public void validPass(String validPassword)
	{
		passTextBox.sendKeys(validPassword);
	}
	public void firstName(String fname)
	{
		firstNameTextBox.sendKeys(fname);
	}
	public void lastName(String lname)
	{
		lastNameTextBox.sendKeys(lname);
	}
	public void clickOnCreateButton()
	{
		createUserButton.click();
	}
	public void clickOnTab()
	{
		createUser.click();
	}
	public void retypePass(String validPassword)
	{
		retypePassTextBox.sendKeys(validPassword);
	}
}