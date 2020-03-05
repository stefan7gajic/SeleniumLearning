package itbootcampSelenium.vezbe.dan1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe"); 
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RS");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.findElement(By.id("search")).click();
		
		driver.findElement(By.id("search")).sendKeys("Sport");
		
		//driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
		
	}

}
