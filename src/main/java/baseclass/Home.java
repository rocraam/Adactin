package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	private WebElement user;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath="//input[@name='login']")
	private WebElement login;
	public Home(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	
	

}
