package SwitchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		//whenever a window opens internally oprating system assign key/id yo each window
		// to konw unique key of window we have one method called as getWindowHandel
		String parentwindow=driver.getWindowHandle();
		System.out.println("This is my frist window id" +parentwindow);
		WebElement tabbutton=driver.findElement(By.xpath("//button[@id='tabButton']"));
		tabbutton.click();
		driver.switchTo();
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles.size());
		                     
		Iterator<String> itr=handles.iterator();
		while(itr.hasNext()) {
			String str=itr.next().toString();
			if(str.equalsIgnoreCase(parentwindow)) {
			System.out.println("We both represent same of window");
		}else {
			System.out.println("We both represent differnt window");
			driver.switchTo().window(str);
			WebElement heading=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
			System.out.println(heading.getText());
		}
		
		
//		WebElement tabbutton=driver.findElement(By.xpath("//button[@id='tabButton']"));
//		tabbutton.click();
//		Set<String> handles=driver.getWindowHandles();
//		
		
//		Iterator<String> itr=handles.iterator();
//		while(itr.hasNext()) {
//                String child=itr.next().toString();
//                if (parentwindow.equalsIgnoreCase(child));
//		}
//		
//		driver.switchTo().window("");
//	}
	}
	}
}