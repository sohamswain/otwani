package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/soham/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath(".//*[@id='myaccount']").click();
		Thread.sleep(3000L);
		driver.findElementByClassName("signin_create_ac_act").click();
		Thread.sleep(3000L);
		driver.findElementById("create_email").sendKeys("osama3@s.com");
		Thread.sleep(6000L);
		driver.findElementById("create_pass").sendKeys("create_pass");
		driver.findElementByXPath("html/body/div[20]/form/div[3]/a[1]").click();
		//driver.findElementByClassName("signin_btn ac_create_act yell_btn").click();
		
	}

}
