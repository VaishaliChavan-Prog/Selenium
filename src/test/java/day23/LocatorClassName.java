package day23;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorClassName {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
        driver.findElement(By.className("gLFyf")).sendKeys("Selenium Webdriver");
	}

}
