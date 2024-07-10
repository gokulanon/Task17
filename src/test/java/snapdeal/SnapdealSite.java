package snapdeal;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealSite {
//public WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		
		
		
	//	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Workspace\\Task17\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	
		
		driver.manage().window().maximize();

	        // Navigate to a website
	        driver.get("https://snapdeal.com/");

	     WebElement mouseHover = driver.findElement(By.xpath("//div[@class='accountInner']"));
	  //    WebElement loginMouseHove =driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']/a"));
	      
	      Actions actions = new Actions(driver);
	      
	     // actions.moveToElement(mouseHover).perform();
	      System.out.println("enter for click");
	      
	    // driver.switchTo().frame(1);    
	        // Click on the dropdown menu to open it
	      
	      actions.moveToElement(mouseHover).perform();
	        // Wait for the Sign In link to be visible and clickable
	       
	     // 
	  String login =    driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']/a")).getAttribute("href");
	  
	  driver.get(login);
	      driver.findElement(By.id("userName")).sendKeys("gokul3369@gmail.com");
	      driver.findElement(By.id("checkUser")).click();
	      
	      System.out.println("click done");
	        
	        
	      
	        // Close the browser
	     //   driver.quit();
	    }
	}
