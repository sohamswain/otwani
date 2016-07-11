package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Paypal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testing.solestruck.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SALE")).click();

		//go to IDP

		WebElement e = driver.findElement(By.xpath(".//*[@id='pageloadProducts']/div[1]/div[21]/a/code/img"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e).perform();
		a1.click().perform();

		//select the size
		Thread.sleep(6000);
		WebElement a=driver.findElement(By.id("shopBy"));
		Select s1=new Select(a);
		s1.selectByIndex(1);
		Thread.sleep(6000);
		//click on add to cart
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(3000);
		//
		/*driver.navigate().back();

		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='pageloadProducts']/div[1]/div[38]/a/code/img")).click();
		Thread.sleep(6000);
		//select the size

		WebElement b=driver.findElement(By.id("shopBy"));
		Select s2=new Select(b);
		s2.selectByIndex(1);
		Thread.sleep(6000);
		//click on add to cart
		driver.findElement(By.id("btnIDP")).click();
		Thread.sleep(6000);*/


		

		driver.findElement(By.id("paypalchkBtn")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("login_email")).sendKeys("personalsb2@gmail.com");
		Thread.sleep(6000);
		driver.findElement(By.id("login_password")).sendKeys("billy123");
		Thread.sleep(6000);
		driver.findElement(By.id("submitLogin")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(6000);
		//driver.findElement(By.id("payment_btn")).click();
		


		
	}

}
