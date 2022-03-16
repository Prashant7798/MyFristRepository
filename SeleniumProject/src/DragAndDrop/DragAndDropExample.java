package DragAndDrop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropExample {


	public static void main(String[] args ) {
		
		System.setProperty("Webdriver.chrome.driver" , "E:\\WORKSPACE\\SeleniumProject\\Resources\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		Actions obj=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		obj.dragAndDrop(source, target).perform();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));
		
		//step-->Webdriver wait class object-->drive waiit condition
		//step-->until
		//step-->ExpectedConditions
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(6));
		//wait.until(ExpectedConditions.elementToBeClickable());
		ExpectedConditions.urlContains("dashboard"); 
		
		


	}

}
