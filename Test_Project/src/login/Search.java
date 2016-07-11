package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/soham/Documents/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElementById("searchText").sendKeys("jeffrey campbell");
		Thread.sleep(3000L);
		driver.findElementById("textSearchButton").click();
		Thread.sleep(3000L);
		driver.findElementByXPath(".//*[@id='pageloadProducts']/div/div[8]/a/code/img").click();
		Thread.sleep(3000L);
		Select mnt = new Select(driver.findElementById("shopBy"));
        mnt.selectByIndex(2);
        Thread.sleep(3000);
	    driver.findElementById("btnIDP").click();
	     Thread.sleep(3000);
	     //driver.findElementByXPath(".//*[@id='wrapper']").click();	 
	    driver.findElementById("cardchkBtn").click();
	    Thread.sleep(3000);
	    driver.findElementById("userEmailId").sendKeys("sohamswain@gmail.com");
	    Thread.sleep(3000);
	    driver.findElementById("pass_new").sendKeys("soham");
	    Thread.sleep(3000);
	    driver.findElementById("signinBtn").click();
	    Thread.sleep(3000);
	    driver.findElementById("card_1").click();
	    Thread.sleep(3000);
	    //driver.findElementById("payment_btn").click();
	    
	    
	}

}
