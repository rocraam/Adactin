package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public Confirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogout() {
		return logout;
	}

}
