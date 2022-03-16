package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("Webdriver.chrome.driver" , "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");	
        //when you create object them automatically browse will launch
	ChromeDriver driver=new ChromeDriver();
	//driver is reference of chromedriver class
	//Enter the url which is want to enter in the browser
    driver.get("https://demoqa.com/radio-button");
   // WebElement yesradiobutton=driver.findElement(By.xpath("//input[@id='yesRadio']"));
    WebElement yesradiobutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));

    
    yesradiobutton.click();
    
    WebElement noradiobutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label"));
    System.out.println(noradiobutton.isEnabled());
    if(!noradiobutton.isEnabled()) {
        System.out.println("Radio button is disable Test case pass");
    } else {
    	System.out.println("Radio button is enable tset case fail");
    	
    }
}
}