package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class New_tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	       // Wait For Page To Load
	       driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	   
	       // Go to solestruck Page 
	        driver.get("http://www.solestruck.com/");
	      
	       // Maximize Window
	       driver.manage().window().maximize();
	      
	      //WebElement R1 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/ul/li[3]/a"));
	      
	      // Initialize Actions class object
	      Actions builder = new Actions(driver);
	      
	      // Perform Right Click on  MEN and  Open "Men" content in a new tab 
	      //builder.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	      builder.contextClick().sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ENTER).perform();

	}
}
