package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public static WebDriver driver;
	private Home h;
	private Search_Hotel s;
	private Select_Hotel sh;
	private Booking_Section b;
	private Confirmation c;
	
	public Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Home getH() {
		if(h == null) {
		h=new Home(driver);
		}
		return h;
	
	}
	public Search_Hotel getS() {
		if(s == null) {
		s=new Search_Hotel(driver);
		}
		return s;
	}
	public Select_Hotel getSh() {
		if(sh == null) {
		sh=new Select_Hotel(driver);
		}
		return sh;
	}
	public Booking_Section getB() {
		if(b == null) {
		b=new Booking_Section(driver);
		}
		return b;
	}
	public Confirmation getC() {
		if(c == null) {
		c=new Confirmation(driver);
		}
		return c;
	}
	
	

}
