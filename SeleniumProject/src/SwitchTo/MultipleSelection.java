package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select obj=new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		//select method
		obj.selectByIndex(0);
		obj.selectByIndex(2);
		System.out.println(obj.isMultiple());
		//deselect method
		obj.deselectByIndex(2);
		//obj.deselectByVisibleText();
		
		
		

		
		

	}

}
