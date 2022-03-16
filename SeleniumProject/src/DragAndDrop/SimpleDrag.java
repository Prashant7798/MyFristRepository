package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleDrag {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver,chrome,driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement sources=driver.findElement(By.id("dragBox"));
		int X=sources.getLocation().getX()+100;
		int Y=sources.getLocation().getY();
		//action.dragAndDropBy(sources, 500, 50).perform();
		//action.moveToElement(sources).dragAndDropBy(sources, 500, 55).build().perform();
		action.moveToElement(sources).dragAndDropBy(sources, -50, -55).build().perform();
		

	}

}
