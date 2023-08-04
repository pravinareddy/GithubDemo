package SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
