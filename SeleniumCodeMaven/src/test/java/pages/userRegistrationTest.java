package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.userRegistrationObject;


public class userRegistrationTest {
	WebDriver driver = null;
	//static String user1 = "rerukyro@ryteto.me";
	static String user = "xotabuzo@norwegischlernen.info";
	static String pass = "12345";
	public static void main(String[] args) throws InterruptedException {
		
		user12RegistrationTest();
		
		//user2RegistrationTest();
	}
	
	public static void user12RegistrationTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    userRegistrationObject user1obj = new userRegistrationObject(driver);
	    driver.get("http://automationpractice.com/index.php");
	    
	    
	    for(int i=0; i<2; i++)
	    {
	    	if(i>0)
	    	{
	    		user = "rerukyro@ryteto.me";
	    		pass = "12345";
	    		
	    	}
	    	
	    user1obj.signinPage();
	    
	    user1obj.setEmail(user);
	    Thread.sleep(1000);
	    user1obj.submitEmail();
	    user1obj.setTitile1();
	    Thread.sleep(1000);
	    user1obj.firstName("Muntanuz");
	    Thread.sleep(1000);
	    user1obj.lastName("Zaman");
	    Thread.sleep(1000);
	    user1obj.setPassword(pass);
	    Thread.sleep(1000);
	    user1obj.date("18");
	    Thread.sleep(1000);
	    user1obj.month("1");
	    Thread.sleep(1000);
	    user1obj.year("2000");
	    Thread.sleep(1000);
	    user1obj.newsletterCheckbox();
	    Thread.sleep(1000);
	    user1obj.offersCheckbox();
	    Thread.sleep(1000);
	    user1obj.addressFirstName("Muntanuz");
	    Thread.sleep(1000);
	    user1obj.addressLastName("Zaman");
	    Thread.sleep(1000);
	    user1obj.setCompany("AIUB");
	    Thread.sleep(1000);
	    user1obj.setAddress1("#42");
	    Thread.sleep(1000);
	    user1obj.setAddress2("Hatem khan");
	    Thread.sleep(1000);
	    user1obj.setCity("Rajshahi");
	    Thread.sleep(1000);
	    user1obj.state("Alabama");
	    Thread.sleep(1000);
	    user1obj.setPost("06000");
	    Thread.sleep(1000);
	    user1obj.country("United States");
	    Thread.sleep(1000);
	    user1obj.setInfo("Testing12345");
	    Thread.sleep(1000);
	    user1obj.setPhone("310945734574");
	    Thread.sleep(1000);
	    user1obj.setPhoneMobile("34752693847");
	    Thread.sleep(1000);
	    user1obj.setAlias("Jurat");
	    Thread.sleep(1000);
	    user1obj.submitAccountButton();
	    Thread.sleep(1000);
	    user1obj.signOut();
	    
	    }
	    
	    
	}
	
	
	/*
	public static void user2RegistrationTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	    userRegistrationObject user2obj = new userRegistrationObject(driver);
	    driver.get("http://automationpractice.com/index.php");
	    
	    user2obj.signinPage();
	    
	    user2obj.setEmail(user2);
	    Thread.sleep(1000);
	    user2obj.submitEmail();
	    user2obj.setTitile2();
	    Thread.sleep(1000);
	    user2obj.firstName("Muntanuz");
	    Thread.sleep(1000);
	    user2obj.lastName("Zaman");
	    Thread.sleep(1000);
	    user2obj.setPassword("12345");
	    Thread.sleep(1000);
	    user2obj.date("18");
	    Thread.sleep(1000);
	    user2obj.month("1");
	    Thread.sleep(1000);
	    user2obj.year("2000");
	    Thread.sleep(1000);
	    user2obj.newsletterCheckbox();
	    Thread.sleep(1000);
	    user2obj.offersCheckbox();
	    Thread.sleep(1000);
	    user2obj.addressFirstName("Muntanuz");
	    Thread.sleep(1000);
	    user2obj.addressLastName("Zaman");
	    Thread.sleep(1000);
	    user2obj.setCompany("AIUB");
	    Thread.sleep(1000);
	    user2obj.setAddress1("#42");
	    Thread.sleep(1000);
	    user2obj.setAddress2("Hatem khan");
	    Thread.sleep(1000);
	    user2obj.setCity("Rajshahi");
	    Thread.sleep(1000);
	    user2obj.state("Alabama");
	    Thread.sleep(1000);
	    user2obj.setPost("06000");
	    Thread.sleep(1000);
	    user2obj.country("United States");
	    Thread.sleep(1000);
	    user2obj.setInfo("Testing12345");
	    Thread.sleep(1000);
	    user2obj.setPhone("310945734574");
	    Thread.sleep(1000);
	    user2obj.setPhoneMobile("34752693847");
	    Thread.sleep(1000);
	    user2obj.setAlias("Jurat");
	    Thread.sleep(1000);
	    user2obj.submitAccountButton();
	    Thread.sleep(1000);
	    user2obj.signOut();
	    
	}*/

}