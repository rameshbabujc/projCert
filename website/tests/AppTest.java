import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
       public static void main(String[] args) throws IOException, InterruptedException {
       		System.setProperty("webdiver.chrome.driver", "/usr/local/bin/chromedriver");
 		ChromeOptions chromeOptions = new ChromeOptions();
 		chromeOptions.addArguments("--headless");
 		chromeOptions.addArguments("--no-sandbox");

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://localhost:8080");

		WebElement aboutUsLink = driver.findElement(By.LinkText("About Us"));

		aboutUsLink.click();
		

		Thread.sleep(1000);

		if (driver.getPageSource().contains("humour")) {
			System.out.println("Can find text - humour");
			System.out.println("Pass");
		} else {
			System.out.println("Cannot find text - humour");
			System.out.println("Fail");
		}

		driver.quit();
	}
}
				

