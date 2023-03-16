package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://courses.letskodeit.com/practice");

		List<WebElement> alliframes = driver.findElements(By.tagName("iframe"));

		int framesize = alliframes.size();

		System.out.println("NO. of iframes=" + framesize);

		for (int i = 1; i < framesize; i++) {

			String frames = alliframes.get(i).getText();

			System.out.println(frames);

		}

		driver.switchTo().frame("iframe-name");

		driver.findElement(By.name("course")).sendKeys("selenium");

		WebElement button = driver.findElement(By.xpath("//*[@id=\"search\"]/div/button"));

		button.click();

		Thread.sleep(5000);
		
		System.out.println("test case passed!!!");

		driver.switchTo().defaultContent();

		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		WebElement show = driver.findElement(By.id("show-textbox"));
		show.click();

		driver.close();

		driver.quit();

	}

}
