package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {
	
	/* 
	 1) Launch Edge Driver /Chrome driver
	 2) Open URL http://https://demo.nopcommerce.com/
	 3)Validate Title should be "nopcommerce demo store"
	 * 
	 * */

	public static void main(String[] args) {
		//1)Launch the edge browser
	//	WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2) Open URL http://https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3)Validate title should be "nopCommerce demo store. Home page title"
		String actual_title = driver.getTitle();
		System.out.println("actual title is :"+actual_title);
		if(actual_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		// 4) Close browser
		//driver.close(); //Close current window.
		
		//driver.quit();

	}

}
