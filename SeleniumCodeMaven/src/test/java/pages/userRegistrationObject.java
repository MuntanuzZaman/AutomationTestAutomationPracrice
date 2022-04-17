package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class userRegistrationObject {
WebDriver driver = null;
	
	By signin_page = By.xpath("//a[contains(text(),'Sign in')]");
	By email_textbox = By.id("email_create");
	By submit_email = By.id("SubmitCreate");
	By set_title1 = By.id("id_gender1");
	By set_title2 = By.id("id_gender2");
	By first_name = By.id("customer_firstname");
	By last_name = By.id("customer_lastname");
	By password =By.id("passwd");
	By date = By.id("days");
	By newsletter = By.id("newsletter");
	By offers = By.id("optin");
	By address_first_name = By.id("firstname");
	By address_last_name = By.id("lastname");
	By company = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By city = By.id("city");
	By post = By.id("postcode");
	By info = By.id("other");
	By phone = By.id("phone");
	By mobile = By.id("phone_mobile");
	By alias = By.id("alias");
	By submit_account = By.id("submitAccount");
	By sign_out = By.linkText("Sign out");
	
	public userRegistrationObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signinPage() {
		driver.findElement(signin_page).click();
	}
	
	public void setEmail(String text) {
		driver.findElement(email_textbox).sendKeys(text);
	}
	
	public void submitEmail() {
		driver.findElement(submit_email).click();
	}
	
	public void setTitile1() {
		driver.findElement(set_title1).click();
	}
	
	public void setTitile2() {
		driver.findElement(set_title2).click();
	}
	
	public void firstName(String text) {
		driver.findElement(first_name).sendKeys(text);
	}
	
	public void lastName(String text) {
		driver.findElement(last_name).sendKeys(text);
	}
	
	public void setPassword(String text) {
		driver.findElement(password).sendKeys(text);
	}
	
	public void date(String dd) {
		Select d= new Select(driver.findElement(By.id("days")));
		d.selectByValue(dd);
	}
	
	public void month(String mm) {
		Select m= new Select(driver.findElement(By.id("months")));
		m.selectByValue(mm);
	}
	
	public void year(String yy) {
		Select y= new Select(driver.findElement(By.id("years")));
		y.selectByValue(yy);
	}
	
	public void newsletterCheckbox() {
		driver.findElement(newsletter).click();
	}
	
	public void offersCheckbox() {
		driver.findElement(offers).click();
	}
	
	public void addressFirstName(String text) {
		driver.findElement(address_first_name).clear();
		driver.findElement(address_first_name).sendKeys(text);
	}
	
	public void addressLastName(String text) {
		driver.findElement(address_last_name).clear();
		driver.findElement(address_last_name).sendKeys(text);
	}
	
	public void setCompany(String text) {
		driver.findElement(company).sendKeys(text);
	}
	
	public void setAddress1(String text) {
		driver.findElement(address1).sendKeys(text);
	}
	
	public void setAddress2(String text) {
		driver.findElement(address2).sendKeys(text);
	}
	
	public void setCity(String text) {
		driver.findElement(city).sendKeys(text);
	}
	
	public void state(String ss) {
		Select s= new Select(driver.findElement(By.id("id_state")));
		s.selectByVisibleText(ss);
	}
	
	public void setPost(String text) {
		driver.findElement(post).sendKeys(text);
	}
	
	public void country(String cc) {
		Select c= new Select(driver.findElement(By.id("id_country")));
		c.selectByVisibleText(cc);
	}
	
	public void setInfo(String text) {
		driver.findElement(info).sendKeys(text);
	}
	
	public void setPhone(String text) {
		driver.findElement(phone).sendKeys(text);
	}
	
	public void setPhoneMobile(String text) {
		driver.findElement(mobile).sendKeys(text);
	}
	
	public void setAlias(String text) {
		driver.findElement(alias).clear();
		driver.findElement(alias).sendKeys(text);
	}
	
	public void submitAccountButton() {
		driver.findElement(submit_account).click();;
	}
	
	public void signOut() {
		driver.findElement(sign_out).click();
	}

}
