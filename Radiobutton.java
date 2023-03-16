package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");

		WebElement button = driver.findElement(By.id("bmwradio"));

		button.click();

		WebElement hondabutton = driver.findElement(By.id("hondaradio"));

		hondabutton.click();

		if (hondabutton.isSelected() == true)

		{
			System.out.println("test passed!!!");

		}

		// no. of checkbox

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		int countcheckbox = checkbox.size();

		System.out.println(countcheckbox);

		for (int i = 0; i < countcheckbox; i++) {
			String printcheckbox = checkbox.get(i).getAttribute("id");

			System.out.println(printcheckbox);
		}

		// bmw check-box

		WebElement bmw = driver.findElement(By.id("bmwcheck"));
		bmw.click();
		bmw = driver.findElement(By.id("bmwcheck"));
		bmw.click();

		// selecting all the checkbox using attribute value........

		WebElement selectcheckbox = driver.findElement(By.xpath("//input[@value='bmw']"));
		selectcheckbox.click();

		selectcheckbox = driver.findElement(By.xpath("//input[@value='benz']"));

		selectcheckbox.click();

		selectcheckbox = driver.findElement(By.xpath("//input[@value='honda']"));
		selectcheckbox.click();

		driver.close();

	}
}
