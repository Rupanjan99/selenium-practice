package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
   
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url ="https://courses.letskodeit.com/";
		driver.navigate().to(url);
        
	   	//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//driver.close();
				
		String mainwindow = driver.getWindowHandle();
		
		System.out.println(mainwindow);
		
		

	}

}
