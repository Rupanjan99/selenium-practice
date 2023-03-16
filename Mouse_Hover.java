package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/media/rupanjan/New Volume/Selenium/Drivers//media/rupanjan/New Volume/Selenium/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();

		Thread.sleep(2000);

		WebElement top = driver.findElement(By.partialLinkText("Top"));
		top.click();

		String get_top = top.getText();

		System.out.println(get_top);

		WebElement reload = driver.findElement(By.linkText("Reload"));

		String get_reload = reload.getText();

		System.out.println(get_reload);

		reload.click();

		driver.close();
		driver.quit();

	}

}
