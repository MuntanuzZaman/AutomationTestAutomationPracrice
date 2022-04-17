package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInObject {
	WebDriver driver = null;
	
	By login_email = By.xpath("//input[@id='email']");
	By login_password = By.xpath("//input[@id='passwd']");
	By login_button = By.xpath("//button[@id='SubmitLogin']");
	By signin_page = By.xpath("//a[contains(text(),'Sign in')]");
	By sign_out = By.xpath("//a[@title='Log me out']");
	
	public logInObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public void signinPage() {
		driver.findElement(signin_page).click();
	}
	
	public void setLoginEmail(String text) {
		driver.findElement(login_email).sendKeys(text);
	}
	
	public void setLoginPassword(String text) {
		driver.findElement(login_password).sendKeys(text);
	}
	
	public void logInButton() {
		driver.findElement(login_button).click();
	}
	
	public void signOut() {
		driver.findElement(sign_out).click();
	}
	

}
