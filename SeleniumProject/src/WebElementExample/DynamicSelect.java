package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-2-option-0-0")).click();
		
		
		
		

	}

}
