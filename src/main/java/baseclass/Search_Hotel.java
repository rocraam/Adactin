package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_type;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement room_nos;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datepick_in;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement datepick_out;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult_room;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child_room;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement Submit;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	

}
