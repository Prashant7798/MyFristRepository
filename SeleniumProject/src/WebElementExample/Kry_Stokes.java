package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kry_Stokes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		//password.sendKeys("admin123");
		//Approch 1//Whenever you want to press keys which dont have text use keys enum
		//loginbtn.sendKeys(Keys.ENTER);
		//Action class has two method keydown and keyup
//		//Approch 2
//		Actions action=new Actions(driver);
//		//username -Admin
//		//select the Admin text CTRL+A
//		//Actions CLASS has two method keydown and keyup
//		//Both method are only application for control sift and alt
//		//These three key are important and always use as short
//		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		username.click();
//		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//		
       //Approch 3:- we wii
		// sendkeys to do control+a. ctrl+c and ctrl+v
	    String select=Keys.chord(Keys.CONTROL, "a");
	    String copy=Keys.chord(Keys.CONTROL, "c");
	    String paste=Keys.chord(Keys.CONTROL, "v");
	    username .sendKeys(select);
	    username.sendKeys(copy);
	    username.sendKeys(paste);
	}

}
