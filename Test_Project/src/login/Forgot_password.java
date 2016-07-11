package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_password {

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
		driver.findElementByClassName("signin_forgot_pwd_act").click();
		Thread.sleep(3000L);
		driver.findElementById("email_forgot").sendKeys("soham@m.com");
		Thread.sleep(3000L);
		driver.findElementById("resetpassword").click();
		Thread.sleep(3000L);
		driver.close();
		//signin_forgot_pwd_act
		
	}

}
