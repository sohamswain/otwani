package login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewTwo {


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
				Thread.sleep(6000L);
				//driver.findElementByLinkText("SUBMIT REVIEW WITHOUT FACEBOOK").click();
				String s= driver.findElementById("reviewWOFB").getText();
				System.out.println(s);
				
				
				
				
				
				//driver.findElementByClassName("idp_review_text").click();
				Thread.sleep(3000L);
				//driver.findElementByXPath(".//*[@id='reviewWOFB']").click();
				
				
				Thread.sleep(3000L);
				driver.findElementById("userName").clear();
				Thread.sleep(3000L);
				driver.findElementById("userName").sendKeys("Soham Testing");
				Thread.sleep(3000L);
				driver.findElementById("userEmail").clear();
				Thread.sleep(3000L);
				driver.findElementById("userEmail").sendKeys("soh@a-cti.com");
				Thread.sleep(3000L);
				driver.findElementById("r_title").clear();
				Thread.sleep(3000L);
				driver.findElementById("r_title").sendKeys("Test Review");
				Thread.sleep(3000L);
				driver.findElementById("reviewText").click();
				Thread.sleep(3000L);
				driver.findElementById("reviewText").sendKeys("Testing Review");
				Thread.sleep(3000L);
				driver.findElementByClassName("idp_review_rating_holder").click();
				Thread.sleep(3000L);
				driver.findElementById("id5").click();
				Thread.sleep(3000L);
				driver.findElementByClassName("idp_review_rating_holder").click();
				Thread.sleep(3000L);
			    driver.findElementByXPath(".//*[@id='submit_ratingFB']").click();
				
				
				
	}

}
