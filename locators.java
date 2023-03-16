package selenium_practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement  elements =  driver.findElement(By.id("bmwcheck"));
                elements.click();
                
           elements = driver.findElement(By.id("name"));
           
           elements.sendKeys("Rupanjan");
           
           
                
		

		
		
	}

}
