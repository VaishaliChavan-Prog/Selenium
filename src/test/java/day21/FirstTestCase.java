package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	/*
	 1)Launch browser (crome)
	 2)Open URL http://demo.opencart.com
	 3)Validate title should be   'Just a moment...'
	 4) Close browser
*/
	
	public static void main(String[] args) {
	
		//1)Launch browser (crome)
		//ChromeDriver driver=new ChromeDriver(); //create object of chromedriver
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
	
	}

}
