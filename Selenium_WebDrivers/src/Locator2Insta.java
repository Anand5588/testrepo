import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2Insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.close();

	}

}
