package SwitchTo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WORKSPACE\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement selectelement=driver.findElement(By.id("oldSelectMenu"));
		//to select the dropdown and tag is selsect for it
		//Which class we have to use --->SELECT
		
    	Select obj=new Select(selectelement);
//		if(obj.getFirstSelectedOption().getText().equalsIgnoreCase("Red")){
//		System.out.println("Pass");
//	 else
//    		System.out.println("Fail");
//	}

			
			
		
		
		
		
		
		////Opration 1--->Select the valuefrom dropdown
		//1
		obj.selectByIndex(5);
		
		obj.selectByVisibleText("Blue");
		
		obj.selectByValue("7");
		
		//get all value
		List<WebElement> option=obj.getOptions();
		Iterator<WebElement> test=option.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
		}
		
		System.out.println(obj.getFirstSelectedOption().getText());
	
		

	}

}
