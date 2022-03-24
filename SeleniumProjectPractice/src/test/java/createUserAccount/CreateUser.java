package createUserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateUser {
	@Test
	public void UserAccount() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKRAT\\eclipse-workspace\\SeleniumProjectPractice\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("This is Md Hafizur Rahman");
		driver.close();
		

	}
}
