package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver" , "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");	
        //when you create object them automatically browse will launch
	ChromeDriver driver=new ChromeDriver();
	//driver is reference of chromedriver class
	//Enter the url which is want to enter in the browser
    driver.get("https://demoqa.com/webtables");
   List<WebElement> columnname= driver.findElements(By.xpath("//div[@role='columnheader']"));
   for(int i=0; i<columnname.size();i++) {
	   System.out.print(columnname.get(i).getText());
   }
   
   System.out.println(columnname.size());
   Iterator<WebElement> itr=columnname.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next().getText());
   }
   
   List<WebElement> row=driver.findElements(By.xpath("//div[@role='gridcell']"));
   Iterator<WebElement> rowitrator=row.iterator();
   while(rowitrator.hasNext()) {
	   System.out.println(rowitrator.next().getText());
   }
   
   
    
   

	}

}
