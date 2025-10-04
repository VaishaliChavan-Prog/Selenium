package day22;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		driver.findElement(By.name("username")).sendKeys("Admin");
        //driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.className("jR8x9d nyoS7c UzCXuf EIlDfe")).click();
		
	}

}
