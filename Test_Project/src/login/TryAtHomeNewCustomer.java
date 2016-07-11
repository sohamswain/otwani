package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TryAtHomeNewCustomer {
	
	//private static final By By = null;
	WebDriver driver;
	 String serverIP="96.5.28.23";
	Integer port= 8008;
	
	
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
        
        
        //sign up
		//driver.findElement(By.xpath(".//*[@id='myaccount']")).click();
        driver.findElement(By.id("myaccount")).click();
		Thread.sleep(3000L);
		driver.findElement(By.className("signin_create_ac_act")).click();
		Thread.sleep(3000L);
		WebElement email=driver.findElement(By.id("create_email"));
		email.clear();
		email.sendKeys("try@home03.com");
		Thread.sleep(3000L);
		WebElement pass=driver.findElement(By.id("create_pass"));
		pass.clear();
		pass.sendKeys("soham");
		Thread.sleep(3000L);
		driver.findElement(By.linkText("CREATE")).click();
		Thread.sleep(3000L);
		System.out.println("Sign up completed");

		//search for shoe
		driver.findElement(By.id("searchText")).sendKeys("adidas originals");
		Thread.sleep(3000L);
		driver.findElement(By.id("textSearchButton")).click();
		Thread.sleep(3000L);
		WebElement img= driver.findElement(By.xpath("//img[@alt='Adidas Originals In White White Gold Samoa Womens']"));
		img.click();
		Thread.sleep(6000L);
		Select mnt = new Select(driver.findElement(By.id("shopBy")));
        mnt.selectByIndex(1);
        Thread.sleep(3000L);
		driver.findElement(By.id("tAtH_check")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("btnIDP")).click();
		System.out.println("First item added to shopping cart");
		Thread.sleep(6000L);
		
		
		driver.navigate().back();
		Thread.sleep(6000L);
		//second item
		WebElement secimg= driver.findElement(By.xpath("//img[@alt='Adidas Originals In Red Crestwood Mid Mens']"));
		secimg.click();
		
		Thread.sleep(6000L);
		Select mnn = new Select(driver.findElement(By.id("shopBy")));
        mnn.selectByIndex(1);
        
        Thread.sleep(6000L);
        driver.findElement(By.id("tAtH_check")).click();
        Thread.sleep(3000L);
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(6000L);
		System.out.println("2nd item added to cart");
		
		
		
		//third item
		driver.navigate().back();
		
		Thread.sleep(6000L);
       
        driver.findElement(By.xpath("//img[@alt='Adidas Originals In Royal Blue Crestwood Mid Mens']")).click();
        Thread.sleep(6000L);
        Select mnp = new Select(driver.findElement(By.id("shopBy")));
        mnp.selectByIndex(3);
		Thread.sleep(3000L);
		driver.findElement(By.id("tAtH_check")).click();
		Thread.sleep(3000L);
		
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(3000L);
		System.out.println("Third item added to cart");
		
		//chekout button in shopping cart
		Thread.sleep(3000L);
		driver.findElement(By.id("cardchkBtn")).click();
		Thread.sleep(6000L);
		
		//filling shipping details
		driver.findElement(By.id("shippinginfo_firstName")).sendKeys("soham");
		Thread.sleep(3000L);
		driver.findElement(By.id("shippinginfo_lastName")).sendKeys("kumar");
		Thread.sleep(3000L);
		driver.findElement(By.id("shippinginfo_phone")).sendKeys("7418147035");
		Thread.sleep(3000L);
		driver.findElement(By.id("shippinginfo_addr1")).sendKeys("Csir road");
		Thread.sleep(3000L);
		driver.findElement(By.id("shippinginfo_addr2")).sendKeys("Taramani");
		Thread.sleep(3000L);
		driver.findElement(By.id("shippinginfo_city")).sendKeys("Portland");
		Thread.sleep(3000L);
		Select state = new Select(driver.findElement(By.id("select_shippinginfo_state")));
        state.selectByVisibleText("California");
        Thread.sleep(3000L);
        
        driver.findElement(By.id("shippinginfo_zip")).sendKeys("600013");
        Thread.sleep(3000L);
        System.out.println("shipping details filled");
        Thread.sleep(3000L);
        
        //card details
		driver.findElement(By.id("cardNumber")).sendKeys("4856200228565001");
		Thread.sleep(3000L);
		driver.findElement(By.id("cardExp")).sendKeys("09/2017");
		Thread.sleep(3000L);
		driver.findElement(By.id("cardCCV")).sendKeys("771");
		System.out.println("card details filled");
		
		
	    Thread.sleep(3000);
	   //driver.findElement(By.id("payment_btn")).click();
	   //Thread.sleep(3000);
	   //System.out.println("order is placed");

	}

}





