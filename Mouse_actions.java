package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");

		Actions action = new Actions(driver);

		// drag and drop

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		action.dragAndDrop(drag, drop).build().perform();

		driver.close();
	}

}
