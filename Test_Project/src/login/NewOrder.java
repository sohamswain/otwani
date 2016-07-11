package login;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class NewOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.solestruck.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
s1.selectByIndex(2);
Thread.sleep(6000);
//click on add to cart
driver.findElement(By.id("btnIDP")).click();
Thread.sleep(3000);
//
driver.navigate().back();

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
Thread.sleep(6000);


//switch to pop up
//driver.switchTo().activeElement();

driver.findElement(By.id("cardchkBtn")).click();
Thread.sleep(6000);

//facebook link
driver.findElement(By.linkText("Facebook")).click();
Thread.sleep(6000);


//swithch to window
Set<String> s3=driver.getWindowHandles();

//Switch to new window opened
Iterator<String> it = s3.iterator();

String parentid =it.next();
String childid= it.next();
driver.switchTo().window(childid);






WebElement email=driver.findElement(By.id("email"));
email.clear();
email.sendKeys("sohamswain@gmail.com");
Thread.sleep(6000);

WebElement pass=driver.findElement(By.id("pass"));
pass.clear();
pass.sendKeys("106794");
Thread.sleep(6000);




driver.findElement(By.id("u_0_2")).click();
Thread.sleep(6000);



//Switch back to original browser (first window) 
driver.switchTo().window(parentid);




driver.findElement(By.id("card_1")).click();
driver.findElement(By.id("payment_btn")).click();


	}

}
