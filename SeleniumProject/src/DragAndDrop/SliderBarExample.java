package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderBarExample {

	public static void main(String[] args) {
     
		System.setProperty("Webdriver,chrome,driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement sources=driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		int X=sources.getLocation().getX()+10;
		int Y=sources.getLocation().getY();
		action.clickAndHold(sources).moveByOffset(X, Y).release().build().perform();
	}

}
