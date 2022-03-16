package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Actions obj=new Actions(driver);
		obj.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		obj.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();

	}

}
