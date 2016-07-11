package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "/Users/user/Downloads/IEDriverServer.exe");// only runs in windows
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.solestruck.com");
	}

}
//System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");