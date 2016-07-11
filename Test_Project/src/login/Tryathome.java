package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tryathome {
	
	//private static final By By = null;
	WebDriver driver;
	 String serverIP="155.14.140.51";
	Integer port= 8080;
	
	
	@BeforeTest
	public void setUpDriver(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type",1);
		profile.setPreference("network.proxy.ftp",serverIP);
		profile.setPreference("network.proxy.http",serverIP);
		profile.setPreference("network.proxy.socks",serverIP);
		profile.setPreference("network.proxy.ssl",serverIP);
		profile.setPreference("network.proxy.ftp_port",port);
		profile.setPreference("network.proxy.http_port",port);
		profile.setPreference("network.proxy.socks_port",port);
		profile.setPreference("network.proxy.ssl_port",port);

		
		//System.out.println("FirefoxProfile.PORT_PREFERENCE :: "+FirefoxProfile.PORT_PREFERENCE);
		driver = new FirefoxDriver(profile);
	
	}
	
	@Test
	
	public void start() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("http://www.solestruck.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000L);
        driver.findElement(By.linkText("Shop New Arrivals")).click();
        Thread.sleep(6000L);
		driver.findElement(By.xpath(".//*[@id='myaccount']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("email_login_new")).clear();
		driver.findElement(By.id("email_login_new")).sendKeys("sohamswain@gmail.com");
		Thread.sleep(3000L);
		driver.findElement(By.id("pass_new")).clear();
		Thread.sleep(3000L);
		driver.findElement(By.id("pass_new")).sendKeys("soham");
		Thread.sleep(6000L);
		driver.findElement(By.id("login_signIn")).click();
		Thread.sleep(6000L);
		driver.findElement(By.id("searchText")).sendKeys("crank boot");
		Thread.sleep(3000L);
		driver.findElement(By.id("textSearchButton")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id='pageloadProducts']/div/div[2]/a/div/h3")).click();
		Thread.sleep(6000L);
		Select mnt = new Select(driver.findElement(By.id("shopBy")));
        mnt.selectByIndex(1);
        Thread.sleep(3000L);
		driver.findElement(By.id("tAtH_check")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(6000L);
		//String winHandleBefore = driver.getWindowHandle();
		//for(String winHandle : driver.getWindowHandles()){
			//driver.switchTo().window(winHandle); }
		
		//to click in the shopping cart
		//driver.findElement(By.id("backgroundPopup")).click();
		
		//driver.findElement(By.className("cart_btn_holder")).click();
		//driver.findElement(By.id("cardchkBtn")).click();
		//Thread.sleep(3000L);
		//driver.findElement(By.linkText("Keep Shopping")).click();
		
		//driver.findElement(By.id("cardchkBtn")).click();
		//driver.findElement(By.className("fr")).click();
		//driver.findElement(By.partialLinkText("Add")).click();
		Thread.sleep(6000L);
		driver.navigate().refresh();
		Select mnn = new Select(driver.findElement(By.id("shopBy")));
        mnn.selectByIndex(2);
        
        Thread.sleep(6000L);
        driver.findElement(By.id("tAtH_check")).click();
        Thread.sleep(3000L);
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(6000L);
		driver.navigate().refresh();
		//driver.findElement(By.className("cart_btn_holder")).click();
		Thread.sleep(6000L);
        //driver.findElement(By.id("cardchkBtn")).click();
        Thread.sleep(3000L);
        Select mnp = new Select(driver.findElement(By.id("shopBy")));
        mnp.selectByIndex(3);
		Thread.sleep(3000L);
		driver.findElement(By.id("tAtH_check")).click();
		Thread.sleep(3000L);
		
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(3000L);
		
		
		//driver.findElement(By.id("cartWithContent")).click();
		//driver.findElement(By.className("cart_btn_holder")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("cardchkBtn")).click();
		Thread.sleep(6000L);
		Select state = new Select(driver.findElement(By.id("select_shippinginfo_state")));
        state.selectByIndex(4);
        Thread.sleep(3000L);
		driver.findElement(By.id("card_5")).click();
	    Thread.sleep(3000);
	   //driver.findElement(By.id("payment_btn")).click();

	}

}


