package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.casualDressesObject;
import pages.logInObject;

public class casualDressesTest {

	WebDriver driver = null;
	static String user1 = "hytorico@thichanthit.com";
	static String pass1 = "12345";
	static String user2 = "cupulibu@thichanthit.com";
	static String pass2 = "12345";
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		casualDressesSelect();

	}
	
	public static void casualDressesSelect() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    casualDressesObject user1obj = new casualDressesObject(driver);
	    casualDressesObject user2obj = new casualDressesObject(driver);
	    driver.get("http://automationpractice.com/index.php");
	    
	    user1obj.signinPage();
	    user1obj.setLoginEmail(user1);
	    user1obj.setLoginPassword(pass1);
	    user1obj.logInButton();
	    user1obj.casualDresses();
	    user1obj.selectDress();
	    user1obj.tshirtPage();
	    user1obj.selectTshirt();
	    user1obj.checkout();
	    user1obj.signOut();
	    
	    user2obj.setLoginEmail(user2);
	    user2obj.setLoginPassword(pass2);
	    user2obj.logInButton();
	    user2obj.casualDresses();
	    user2obj.selectDress();
	    user2obj.tshirtPage();
	    user2obj.selectTshirt();
	    user2obj.checkout();
	    user2obj.signOut();
	    
	    
	    
	}
	
	

}