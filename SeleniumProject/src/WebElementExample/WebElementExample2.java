package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample2 {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver" , "E:\\\\WORKSPACE\\\\SeleniumProject\\\\Resources\\\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/account/login?ret=/");
       System.out.println(driver.getTitle());
       driver.manage().window().maximize();
       
       WebElement Enter=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
       Enter.sendKeys("7798769377");
     
       WebElement Password= driver.findElement(By.cssSelector("#container > div > div._2dSUjN > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input"));
       Password.sendKeys("Prashant@143");
       
       
       
	}

}
