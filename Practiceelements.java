package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceelements {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binda\\OneDrive\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement nametextbox = driver.findElement(By.id("name"));
				
		nametextbox.sendKeys("Rupanjan");
		
		nametextbox = driver.findElement(By.id("name"));
		
		nametextbox.clear();
		
		nametextbox = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		nametextbox.sendKeys("Routh");
		
		WebElement  hidebutton = driver.findElement(By.id("hide-textbox"));
		  
		hidebutton.click();
		
		  WebElement showbutton = driver.findElement(By.id("show-textbox"));
		  
		 showbutton.click();
	
	 
		 	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		 	int linksize = alllinks.size();
		  
			              
		 	System.out.println("no. of links = "+   linksize);
		 	
		 	for(int i=0; i<linksize; i++) {
		 		
		 	String sValue = alllinks.get(i).getAttribute("href");
		 	
		 	System.out.println(sValue);
		 	}
			
		  
	
		   driver.close();
		  
			  
	}

}
