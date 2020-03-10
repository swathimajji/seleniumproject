package webapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpack {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\ChromerDriver\\chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://account.packtpub.com/login");
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("swathiten@gmail.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Swathi@1027");
	    driver.findElement(By.xpath("//button/span")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Free Learning')])[2]")).click();
	    driver.findElement(By.id("fl-claim-btn")).click();
	    driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div/button/span")).click();
	    driver.findElement(By.linkText("best books")).click();

	}

}
