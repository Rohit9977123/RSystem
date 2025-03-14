package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {

	WebDriver driver;

	Select s;
		
		//Create a constructor 
		public Register(WebDriver driver){
			
			this.driver = driver;
			
			PageFactory.initElements(driver , this);

		}
		@FindBy(css = "[placeholder=\'Username\']")
		private WebElement uname;

		
		@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/form/input[2]")
		private WebElement pass;

		@FindBy(css = "[type=\'submit\']")
		private WebElement rbtn;

		public WebElement getUsernam() {
			return uname;
		}

		public WebElement getPassword() {
			return pass;
		}

		public WebElement getBtn() {
			return rbtn;
		}
		
		public void Details(String username, String Password ) {
			
			this.uname.sendKeys(username);
			this.pass.sendKeys(Password);
			
			
		}
		
		public void Btn() {

			this.rbtn.click();
		}
}