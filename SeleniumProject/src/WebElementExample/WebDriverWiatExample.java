package WebElementExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWiatExample {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver" , "E:\\WORKSPACE\\SeleniumProject\\Resources\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		System.out.println("Before Click");
		WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		//System.out.println("Before Click");
		driver.findElement(By.id("enableAfter")).click();
		System.out.println("After Click");

	}

}
