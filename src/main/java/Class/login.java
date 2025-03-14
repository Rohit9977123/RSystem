package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{

	WebDriver driver;

	public login(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
		
	}

	@FindBy(css = "#root > div > main > div > form > input[type=text]:nth-child(1)")
	private WebElement uname;
	

	@FindBy(css = "#root > div > main > div > form > input[type=password]:nth-child(2)")
	private WebElement pass;	
	
	@FindBy(css = "#root > div > main > div > form > button")
	private WebElement logbtn;
	
	public WebElement getLogin() {
		return uname;
	}

	public WebElement getPassword() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return logbtn;
	}
	public void Login(String username , String password) {
		
		uname.sendKeys(username);
		this.pass.sendKeys(password);
		logbtn.click();
	
}
}