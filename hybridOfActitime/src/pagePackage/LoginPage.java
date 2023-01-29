package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		
		// To avoid StellReferenceException
		
		@FindBy(name="username")private WebElement UsernameTB;
		@FindBy(name="pwd")private WebElement PasswordTB;
		@FindBy(id="loginButton")private WebElement LoginButton;
		@FindBy(id="keepLoggedInCheckBox")private WebElement LoggedInCheckBox;
		@FindBy(xpath="//a[.='Actimind Inc.']")private WebElement ActiMindLink;
		@FindBy(xpath="//a[.='License for using this software']")private WebElement LicenseLink;
		
		
		
		
		public LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//Utilization
		
		
		public WebElement getUsernameTB() {
			return UsernameTB;
		}
		public WebElement getPasswordTB() {
			return PasswordTB;
		}
		public WebElement getLoginButton() {
			return LoginButton;
		}
		public WebElement getLoggedInCheckBox() {
			return LoggedInCheckBox;
		}
		public WebElement getActiMindLink() {
			return ActiMindLink;
		}
		public WebElement getLicenseLink() {
			return LicenseLink;
		}
		
		//Operational methods
		
		public void actiTimeValidLogin(String validUsername, String validPassword) throws InterruptedException
		{
			UsernameTB.sendKeys(validUsername);
			Thread.sleep(2000);
			PasswordTB.sendKeys(validPassword);
			Thread.sleep(2000);
			LoginButton.click();
		
		

	}

}
