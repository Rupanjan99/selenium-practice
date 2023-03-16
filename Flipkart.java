package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/media/rupanjan/New Volume/Selenium/Drivers//media/rupanjan/New Volume/Selenium/Drivers/chromedriver");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.flipkart.com/";

		driver.navigate().to(url);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iphone 14");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();

		// driver.navigate().back();
		// driver.navigate().refresh();

		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[3]")).click();
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")).click();
		// driver.close();
		// driver.quit();

	}

}
