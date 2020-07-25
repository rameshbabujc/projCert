// Selenium based test application for AppleBiteCo simplePHP Web App
// Collated by: Ramesh Babu Jaya Chandran
// Date: 25 July 2020

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
       public static void main(String[] args) throws IOException, InterruptedException {
       		System.setProperty("webdiver.chrome.driver", "/usr/local/bin/chromedriver");

		// Chrome Options to enable Headliness mode

 		ChromeOptions chromeOptions = new ChromeOptions();
 		chromeOptions.addArguments("--headless");
 		chromeOptions.addArguments("--no-sandbox");

		WebDriver driver = new ChromeDriver(chromeOptions);

		// URL of the webapp that runs in a docker container

		driver.get("http://localhost:8080");

		// Code below finds the Web Element "About Us"

		WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));

		// Code below clicks on the link "About Us"

		aboutUsLink.click();
		

		Thread.sleep(1000);

		// Code below checks if there's a text 
		// called "humour" in the About Us page

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
				

