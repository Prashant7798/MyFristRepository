package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExampleApproch2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "E:\\\\WORKSPACE\\\\SeleniumProject\\\\Resources\\\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        
        WebElement HomeCheckbox=driver.findElement(By.xpath("//*[@id=\\\"tree-node\\\"]/ol/li/span/label"));
        if(HomeCheckbox.isSelected()); {
        	HomeCheckbox.click();	
        }
        
        WebElement Result=driver.findElement(By.xpath("//div[@id=\\'result\\']"));
        if(Result.isDisplayed()) {
        	System.out.println(Result.getText());
        }
        
        
        
        
        
	}

}
