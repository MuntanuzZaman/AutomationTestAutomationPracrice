package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class casualDressesObject {
	WebDriver driver = null;
	
	By login_email = By.xpath("//input[@id='email']");
	By login_password = By.xpath("//input[@id='passwd']");
	By login_button = By.xpath("//button[@id='SubmitLogin']");
	By signin_page = By.xpath("//a[contains(text(),'Sign in')]");
	By dresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	By casual_dresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
	By dress = By.xpath("//a[@title='Printed Dress']//img[@title='Printed Dress']");
	By add_to_cart = By.xpath("//span[normalize-space()='Add to cart']");
	By close_cross = By.xpath("//span[@title='Close window']");
	By count_shopping = By.xpath("//span[@title='Continue shopping']//span[1]");
	By tshirt_page = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
	By blue = By.cssSelector("#layered_id_attribute_group_14");
	By tshirt = By.cssSelector("img[title='Faded Short Sleeve T-shirts']");
	By blue_button = By.cssSelector("#color_2");
	By add_cart_button = By.xpath("//span[contains(text(),'Add to cart')]");
	By checkout = By.xpath("//span[normalize-space()='Proceed to checkout']");
	By proceed_checkout = By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] span");
	By proceed_address = By.cssSelector("button[name='processAddress'] span");
	By terms = By.xpath("//input[@id='cgv']");
	By proceed_carrier = By.cssSelector("button[name='processCarrier'] span");
	By pay_check = By.xpath("//a[@title='Pay by check.']");
	By confirm_order = By.xpath("//span[normalize-space()='I confirm my order']");
	By sign_out = By.xpath("//a[@title='Log me out']");
	
	public casualDressesObject(WebDriver driver) {
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
	
	public void casualDresses() {
		WebElement menu = driver.findElement(dresses);
		Actions actions = new Actions(driver);
		actions.moveToElement(menu);
		WebElement subMenu = driver.findElement(casual_dresses);
		actions.moveToElement(subMenu);
		actions.click().build().perform();
	}
	
	public void selectDress() throws InterruptedException {
		WebElement dressHover = driver.findElement(dress);
		Actions actions = new Actions(driver);
		actions.moveToElement(dressHover);
		WebElement addCart = driver.findElement(add_to_cart);
		actions.moveToElement(addCart);
		actions.click().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(count_shopping).click();
	
		
		
	}
	
	public void tshirtPage() {
		driver.findElement(tshirt_page).click();
	}
	
	public void filterBlue() {
		driver.findElement(blue).click();
		
	}
	
	public void selectTshirt() throws InterruptedException {
		WebElement shirtHover = driver.findElement(tshirt);
		Actions actions = new Actions(driver);
		actions.moveToElement(shirtHover);
		WebElement blueButton = driver.findElement(blue_button);
		actions.moveToElement(blueButton);
		actions.click().build().perform();
		Thread.sleep(2000); 
		
		driver.findElement(add_cart_button).click();
	}
	
	public void checkout() {
		driver.findElement(checkout).click();
		driver.findElement(proceed_checkout).click();
		driver.findElement(proceed_address).click();
		driver.findElement(terms).click();
		driver.findElement(proceed_carrier).click();
		driver.findElement(pay_check).click();
		driver.findElement(confirm_order).click();
		
		
	}
	
	public void signOut() {
		driver.findElement(sign_out).click();
	}
	

}
	
