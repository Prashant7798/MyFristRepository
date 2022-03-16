package WebElementExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxApproch3 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		
		WebElement HomeCheckbox=driver.findElement(By.xpath("//*[@id=\'tree-node\']/ol/li/span/label"));
//	    if(HomeCheckbox.isSelected()) {   
//	    	HomeCheckbox.click();
		List<WebElement> Result=driver.findElements(By.xpath("//div[@id=\'result\']"));
		
		if(Result.size()>0) {
			System.out.println(Result.get(0).getText());
		}  else {
	    	System.out.println("Test case is failed system is not showing result");
	    }
	
		
	}

}
