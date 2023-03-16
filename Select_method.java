package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://courses.letskodeit.com/practice");

		WebElement honda = driver.findElement(By.id("carselect"));
		Select selecthonda = new Select(honda);

		selecthonda.selectByIndex(2);

		WebElement benz = driver.findElement(By.id("carselect"));
		Select selectbenz = new Select(benz);
		selectbenz.selectByValue("benz");

		WebElement bmw = driver.findElement(By.id("carselect"));
		Select selectbmw = new Select(bmw);
		selectbmw.selectByVisibleText("BMW");

		WebElement dropdown = driver.findElement(By.id("multiple-select-example"));
		Select multiselect = new Select(dropdown);
		if (multiselect.isMultiple()) {
			System.out.println("yes dropdown is multislect");
			multiselect.selectByValue("apple");
			multiselect.selectByValue("orange");
			multiselect.selectByValue("peach");
		}

		List<WebElement> multidropdown = driver.findElements(By.id("multiple-select-example"));

		int dropdownsize = multidropdown.size();

		for (int i = 0; i < dropdownsize; i++) {

			String listofoptions = multidropdown.get(i).getText();

			System.out.println(listofoptions);

		}

		WebElement orange = driver.findElement(By.id("multiple-select-example"));

		Select deorange = new Select(orange);

		deorange.deselectByIndex(1);

		WebElement firstselect = driver.findElement(By.id("multiple-select-example"));

		Select first = new Select(firstselect);

		String firstselectedoption = first.getFirstSelectedOption().getText();

		System.out.println(firstselectedoption);

		WebElement deselectall = driver.findElement(By.id("multiple-select-example"));

		Select deselectmulti = new Select(deselectall);

		deselectmulti.deselectAll();

		driver.close();
	}

}
