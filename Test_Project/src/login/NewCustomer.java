package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewCustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver(); // opened the Firefox
		driver.get("http://www.solestruck.com"); // opened the website
		driver.manage().window().maximize();   // maximized the window
		
		
		//Sign up
		driver.findElement(By.id("myaccount")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("No Account? Create One.")).click();
		Thread.sleep(6000);
	    WebElement a=driver.findElement(By.id("create_email"));
	    a.clear();
	    a.sendKeys("soh@006.com");
	    Thread.sleep(6000);
	    WebElement b=driver.findElement(By.id("create_pass"));
	    b.clear();
	    b.sendKeys("soham");
	    Thread.sleep(6000);
	    driver.findElement(By.linkText("CREATE")).click();
	    Thread.sleep(6000);
	    
	    //Select listing page
	    driver.findElement(By.linkText("WOMEN")).click();
	    Thread.sleep(8000);
	    
	    
	    //select a shoe in the women listing page
	    driver.findElement(By.xpath(".//*[@id='pageloadProducts']/div[1]/div[1]/a/code/img")).click();
	    Thread.sleep(6000);
	    
	    //select size
	    WebElement c= driver.findElement(By.id("shopBy"));
	    Select s1= new Select(c);
	    s1.selectByIndex(1);
	    Thread.sleep(6000);
	    System.out.println("size is selected");
	    
	    
	    //click on Add to cart button
	    driver.findElement(By.id("btnIDP")).click();
	    System.out.println("Item added to shopping cart");
	    Thread.sleep(6000);
	    
	    //click on credit button in the shopping cart
	    driver.findElement(By.id("cardchkBtn")).click();
	    System.out.println("clicked on credit button");
	    Thread.sleep(6000);
	    //fill the details in the checkout page for new customer
	    driver.findElement(By.id("shippinginfo_firstName")).sendKeys("soham");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_lastName")).sendKeys("kumar");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_phone")).sendKeys("7418147035");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_addr1")).sendKeys("Taramani");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_addr2")).sendKeys("Csir road");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_city")).sendKeys("Chennai");
	    Thread.sleep(3000);
	    WebElement s= driver.findElement(By.id("select_shippinginfo_state"));
	    Select state= new Select(s);
	    state.selectByVisibleText("California");
	    Thread.sleep(3000);
	    driver.findElement(By.id("shippinginfo_zip")).sendKeys("600113");
	    Thread.sleep(3000);
	    System.out.println("shipping details filled for new customer");
	    
	    //select the shipping method
	    driver.findElement(By.xpath(".//*[@id='shipMethodLi']/div[2]")).click();
	    Thread.sleep(5000);
	    WebElement ship= driver.findElement(By.id("shippingmethods"));
	    Select shiping= new Select(ship);
	    shiping.selectByIndex(1);
	    System.out.println("shipping method selected");
	    Thread.sleep(3000);
	    
	    //fill the card details
	    driver.findElement(By.id("cardNumber")).sendKeys("4856200228565001");
	    Thread.sleep(3000);
	    driver.findElement(By.id("cardExp")).sendKeys("09/2017");
	    Thread.sleep(3000);
	    driver.findElement(By.id("cardCCV")).sendKeys("771");
	    Thread.sleep(3000);
	    System.out.println("card details filled");
	    
	    //complete the purchase
	    driver.findElement(By.id("payment_btn")).click();
	    Thread.sleep(10000);
	    System.out.println("order placed");
	    
		

	}

}
