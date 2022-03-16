package SeleniumPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main (String[] args )   {
		
		System.setProperty("WebDriver.gecko.driver" , "..\\Resources\\geckodriver.exe");
         FirefoxDriver driver=new FirefoxDriver();
		
//		driver.get("https://www.Firefox.com");
		driver.navigate().to("https://www.google.com");

		System.out.println(driver.getTitle());
		
		}

}
