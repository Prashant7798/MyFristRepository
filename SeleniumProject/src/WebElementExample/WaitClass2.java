package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitClass2 implements ExpectedCondition<Boolean> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean apply(WebDriver driver) {
		return driver.findElement(By.id("")).isSelected();
	}

}
