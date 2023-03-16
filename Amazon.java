package selenium_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		

		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone 14pro");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	}

}
