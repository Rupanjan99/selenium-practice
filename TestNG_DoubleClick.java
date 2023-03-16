package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DoubleClick {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
	}
	
	@AfterClass
	public void tear()    {
		
		driver.close();
		
	}
	
	@Test
	public void doubleClick() {
		
		Actions action = new Actions(driver);

		// double_click

		WebElement double_click = driver.findElement(By.id("doubleClickBtn"));

		action.doubleClick(double_click).build().perform();

		String get_text_doubleClick = double_click.getText();
		System.out.println(get_text_doubleClick);

		// right click

		WebElement right_click = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(right_click).build().perform();

		String get_rightClick_text = right_click.getText();

		System.out.println(get_rightClick_text);
		
	}
	

}
