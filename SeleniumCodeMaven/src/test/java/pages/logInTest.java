package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.logInObject;
import pages.userRegistrationObject;

public class logInTest {
	WebDriver driver = null;
	

	public static void main(String[] args) {
		
		
		user1LogIn();

	}
	
	public static void user1LogIn() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    logInObject user1obj = new logInObject(driver);
	    driver.get("http://automationpractice.com/index.php");
	    
	    user1obj.signinPage();
	    user1obj.setLoginEmail("hytorico@thichanthit.com");
	    user1obj.setLoginPassword("12345");
	    user1obj.logInButton();
	    user1obj.signOut();
	    
	}
	
	public static void user2LogIn() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    logInObject user2obj = new logInObject(driver);
	    driver.get("http://automationpractice.com/index.php");
	    
	    user2obj.signinPage();
	    user2obj.setLoginEmail("cupulibu@thichanthit.com");
	    user2obj.setLoginPassword("12345");
	    user2obj.logInButton();
	    user2obj.signOut();
	}

}