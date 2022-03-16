package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("content");
		
		 WebElement header=driver.findElement(By.tagName("h1"));
		 System.out.println(header.getText());
		 driver.switchTo().defaultContent();
		 //switch to frame by webelement
		 WebElement frame=driver.findElement(By.xpath("/html/frameset/frameset/frameset/frameset/frame[1]"));
		 driver.switchTo().frame(frame);
		 
		 WebElement noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
		 System.out.println(noframe.getText());
		 
		 
		 
	}


}
