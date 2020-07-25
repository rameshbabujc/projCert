import java.io.IOException;

import org.openqa.selenium.WebDriver;
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

		Thread.sleep(1000);

		if (driver.getPageSource().contains("About Us")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();
	}
}
				

