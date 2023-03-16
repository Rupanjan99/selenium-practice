package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");

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
