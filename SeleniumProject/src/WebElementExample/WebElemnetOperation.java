package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElemnetOperation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		//Navigation test=driver.navigate();
		//test.to("https://www.myntra.com/login");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//fine the address and perform the operation
		//enter the value full name field
		//Address of element is called as locator
		WebElement Fullname= driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		//to enter values in element we use sendkeys method from webelement
		Fullname.sendKeys("Testing");
		//To enter the value of email
		//find the element ---FindElement
		WebElement Email=driver.findElement(By.cssSelector("input[placeholder=\'name@example.com\']"));
		Email.sendKeys("Prashant@prk.com");
		
		WebElement Address=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
	    Address.sendKeys("At post Narhe pune");
	    
	    WebElement permanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAddress.sendKeys("At post mukhed Tq. Mukhed Dist.Nanded 431715 ");
		
		Fullname.clear(); //it will delete testing word.(delete the value)
		Fullname.sendKeys("My New Value");
		
		System.out.println(Fullname.getTagName());
		
		WebElement Submit=driver.findElement(By.id("submit"));
		System.out.println(Submit.getText());
		System.out.println("Height "+Submit.getSize().getHeight());
		System.out.println("Width "+Submit.getSize().getWidth());
		
		System.out.println(Fullname.getAttribute("id"));
		//Submit.click();
		
		
		
		

	}

}
