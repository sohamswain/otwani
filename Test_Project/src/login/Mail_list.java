package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mail_list {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/soham/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		Actions a1 = new Actions(driver);
	    a1.moveToElement(driver.findElement(By.xpath(".//*[@id='wrapper']/div[3]/div[2]/label"))).build().perform();
		driver.findElementById("subscribeEmail").sendKeys("soham@testing.com");
		Thread.sleep(3000L);
		//driver.findElementById("email_send_btn").click();
		driver.findElementByXPath(".//*[@id='wrapper']/div[3]/div[2]/div[1]/input[2]").click();
		Thread.sleep(3000L);
		driver.close();
	}

}
