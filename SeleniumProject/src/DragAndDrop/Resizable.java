package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver,chroe,driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement sources=driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));
		action.clickAndHold(sources).moveByOffset(100, 150).release().build().perform();
		
		

	}

}
