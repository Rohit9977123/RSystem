package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Class.Home;
import Class.login;
import Class.Register;


public class base {
	protected WebDriver driver;
	
	protected String username;
	protected String password ;
	String url;
	protected login lplogin;
	protected Home hpHome;
	protected Register rpRegister;
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Documents\\workspace-spring-tool-suite-4-4.24.0.RELEASE\\RSystem\\src\\test\\resources\\Rsytem.properties");
		properties.load(file);
		url = properties.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		lplogin = new login(driver);
		hpHome = new Home(driver);
		rpRegister = new Register(driver);
		
		username = properties.getProperty("uname");		
		password = properties.getProperty("Pass");


}
	@AfterClass
	public void teardown() {
		
		driver.close();
	}
}