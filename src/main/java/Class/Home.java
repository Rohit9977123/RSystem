package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	//Create a constructor 
	public Home(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
	
	}
	@FindBy(linkText = "Register")
	private WebElement register;
	
	
	@FindBy(linkText = "Login")
	private WebElement login;

	public WebElement getRegister() {
		return register;
	}


	public WebElement getLogin() {
		return login;
	}
	
	

}