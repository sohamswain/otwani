package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Email_us {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/soham/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		Actions a1 = new Actions(driver);
	     a1.moveToElement(driver.findElement(By.xpath(".//*[@id='wrapper']/div[3]/div[1]/div[1]/ul/li[1]/a"))).build().perform();
	     Thread.sleep(3000L);
		driver.findElementByClassName("emailuspopup_act").click();
		Thread.sleep(3000L);
		driver.findElementById("emailUsId").sendKeys("soham@m.com");
		Thread.sleep(3000L);
		driver.findElementById("help").sendKeys("This is Test email. Please ignore");
		Thread.sleep(3000L);
		driver.findElementById("order_number").sendKeys("123456");
		Thread.sleep(3000L);
		driver.findElementById("emailUs_send").click();
		Thread.sleep(3000L);
		driver.close();
		
	}

}
