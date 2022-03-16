package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		Select obj=new Select(dropdown);
		obj.selectByIndex(4);
		//obj.selectByVisibleText(Blue);
		//obj.selectByValue(Value);
		
		

	}

}
