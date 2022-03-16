package SeleniumPractice;


import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webderiver.chrome.driver","..\\Resources\\chromedriver.exe");
		//when you you create object then automatic browser launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		//Navigation test=driver.navigate();
		//test.to("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		
		

	}

}
