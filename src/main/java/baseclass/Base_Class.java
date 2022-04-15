package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(type.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void clickon(WebElement element) {
		element.click();
	}
	public static void send(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Dropdown(WebElement element,String type,String value) {
		Select s=new Select(element);
		if(type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("index")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
		else if(type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}
	public static void wait(int sec) throws Exception {
		Thread.sleep(sec);
	}
	public static void implicit_wait(int sec, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(sec,format);
	}

}

