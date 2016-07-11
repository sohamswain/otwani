package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Review {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/soham/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElementByXPath(".//*[@id='dynamicHomeItems']/div[1]/a/code/img").click();
		//driver.findElementById("").click();
		Thread.sleep(3000L);
		//driver.findElementById("reviewWOFB").click();
		driver.findElementById("r_title").clear();
		Thread.sleep(3000L);
		driver.findElementById("r_title").sendKeys("Testing");
		Thread.sleep(3000L);
		driver.findElementById("reviewText").click();
		Thread.sleep(3000L);
		driver.findElementById("reviewText").sendKeys("Review testing");
		Thread.sleep(3000L);
		driver.findElementById("id5").click();
		Thread.sleep(3000L);
		driver.findElementById("submit_ratingFB").click();
		Thread.sleep(3000L);
		driver.findElementByLinkText("Login With Facebook").click();
		Thread.sleep(5000L);
		driver.findElementById("email").sendKeys("sohamswain@gmail.com");
		Thread.sleep(5000L);
		driver.findElementById("pass").sendKeys("106794");
		Thread.sleep(5000L);
		driver.findElementById("u_0_2").click();
		
		
		
	}

}
