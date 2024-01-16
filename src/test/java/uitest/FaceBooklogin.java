package uitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		       // click on the login link
				
				WebElement UserName =  driver.findElement(By.name("email"));
				UserName.sendKeys("abc@xyz.com");
				
				WebElement Password = driver.findElement(By.id("pass"));
				Password .sendKeys("Abc@12345");
				
				WebElement LoginBtn = driver.findElement(By.name("login"));
				LoginBtn.click();
	}

}
