package day22;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		driver.findElement(By.name("Username")).sendKeys("Admin");
        driver.findElement(By.name("Password")).sendKeys("admin123");
		//driver.findElement(By.className("jR8x9d nyoS7c UzCXuf EIlDfe")).click();
		
	}

}
