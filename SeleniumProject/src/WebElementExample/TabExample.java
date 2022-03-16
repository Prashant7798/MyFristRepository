package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.findElement(By.id("demo-tab-origin")).click();
		System.out.println(driver.findElement(By.id("demo-tabpane-origin")).getText());


	}

}
