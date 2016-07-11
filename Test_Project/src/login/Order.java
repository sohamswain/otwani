package login;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Order {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		// Mouse Over On " Men link " 
	     Actions a1 = new Actions(driver);
	     a1.moveToElement(driver.findElement(By.linkText("Men"))).build().perform();
	     Thread.sleep(3000L);
	     // Wait For Page To Load
	     //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	     // Click on " adidas originals" link
	     driver.findElement(By.xpath(".//*[@id='content_folder']/header/nav/ul[1]/li[2]/div/ul[1]/li[1]/a")).click();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     
	     //shoe
	     driver.findElementByXPath(".//*[@id='pageloadProducts']/div/ul/li[2]/a/img").click();
	     
	     //driver.findElementByXPath(".//*[@id='shopBy']']").click();
	    // driver.findElementByName("size").click();
	  
	     // Click on " bags & backpacks " link
	    // driver.findElement(By.xpath(".//*[@id='shopBy']")).click();

         Thread.sleep(3000);
         Select mnt = new Select(driver.findElementById("shopBy"));
         mnt.selectByIndex(1);
         Thread.sleep(3000);
	     driver.findElementById("btnIDP").click();
	     Thread.sleep(3000);
	     //driver.findElementByXPath(".//*[@id='wrapper']").click();	 
	     driver.findElementById("cardchkBtn").click();
	     
	     driver.findElementById("userEmailId").sendKeys("sohamswain@gmail.com");
	     driver.findElementById("pass_new").sendKeys("soham");
	     driver.findElementById("signinBtn").click();
	    
	     driver.findElementById("card_1").click();
	     
	     driver.findElementById("payment_btn").click();
	     
	     
	}

}
