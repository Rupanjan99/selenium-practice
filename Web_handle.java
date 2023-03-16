package selenium_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_handle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");

		String mainwindow = driver.getWindowHandle();

		System.out.println(mainwindow);

		WebElement open_window = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));

		open_window.click();

		Set<String> allwindows = driver.getWindowHandles();

		Iterator<String> iterator = allwindows.iterator();

		while(iterator.hasNext()) {

			String childwindow = iterator.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {

				driver.switchTo().window(childwindow);

				WebElement searchbar = driver.findElement(By.xpath("//*[@name=\"course\"]"));

				searchbar.sendKeys("Selenium");

				//WebElement search_button = driver.findElement(By.xpath("//*[@id=\"course\"]/div/button"));
				searchbar.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.close();

			}

		}

		driver.switchTo().window(mainwindow);

		WebElement hide = driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]"));
		hide.click();
		Thread.sleep(2000);

		WebElement show = driver.findElement(By.xpath("//*[@id=\"show-textbox\"]"));
		show.click();
		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}

}
