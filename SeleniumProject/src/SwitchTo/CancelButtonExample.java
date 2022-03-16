package SwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelButtonExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement clickbutton=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		clickbutton.click();
		//we have to nned click on OK button of pop uo window
		//step1--<we have to move to alert
		
		Alert obj=driver.switchTo().alert();
		Thread.sleep(5000);
		//step2--<call accept  method if you want to click on OK 
		//call dismiss method if you want click on cancel
		System.out.println(obj.getText());
		obj.dismiss();

	}

}
