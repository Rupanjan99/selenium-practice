package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");

		WebElement enter_name = driver.findElement(By.id("name"));

		enter_name.sendKeys("Rupanjan");

		WebElement alert_button = driver.findElement(By.id("alertbtn"));

		alert_button.click();

		org.openqa.selenium.Alert alert_box = driver.switchTo().alert();
		String alert_text = alert_box.getText();
		System.out.println(alert_text);
		alert_box.accept();
		Thread.sleep(10000);

		WebElement enter_second_name = driver.findElement(By.id("name"));
		enter_second_name.sendKeys("Routh");
		WebElement confirm = driver.findElement(By.id("confirmbtn"));
		confirm.click();

		org.openqa.selenium.Alert alert_confirm = driver.switchTo().alert();
		String alert_accept = alert_confirm.getText();
		System.out.println(alert_accept);
		alert_confirm.dismiss();
		Thread.sleep(10000);

		WebElement enter_full_name = driver.findElement(By.id("name"));
		enter_full_name.sendKeys("Rupanjan Routh");
		WebElement confirm_fullname = driver.findElement(By.id("confirmbtn"));
		confirm_fullname.click();

		org.openqa.selenium.Alert full_name = driver.switchTo().alert();
		String full = full_name.getText();
		System.out.println(full);
		full_name.accept();
		Thread.sleep(10000);

		System.out.println("all test case passed!!!");
		driver.close();
		driver.quit();

	}

}
