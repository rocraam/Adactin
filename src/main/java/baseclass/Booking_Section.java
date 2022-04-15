package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Section {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first_name;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement last_name;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement credit;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement credit_type;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv_no;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book_btn;
	public Booking_Section(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCredit_type() {
		return credit_type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv_no() {
		return cvv_no;
	}
	public WebElement getBook_btn() {
		return book_btn;
	}

}
