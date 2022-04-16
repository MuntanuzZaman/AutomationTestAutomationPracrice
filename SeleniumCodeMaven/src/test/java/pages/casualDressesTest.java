package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.casualDressesObject;
import pages.logInObject;

public class casualDressesTest {

	WebDriver driver = null;
	
	
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
	    driver.get("http://automationpractice.com/index.php");
	    
	    user1obj.signinPage();
	    user1obj.setLoginEmail("hytorico@thichanthit.com");
	    user1obj.setLoginPassword("12345");
	    user1obj.logInButton();
	    user1obj.casualDresses();
	    user1obj.selectDress();
	    user1obj.tshirtPage();
	    user1obj.selectTshirt();
	    user1obj.checkout();
	    user1obj.signOut();
	    
	    
	}
	
	

}