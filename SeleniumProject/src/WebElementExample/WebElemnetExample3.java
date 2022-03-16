package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElemnetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "E:\\WORKSPACE\\SeleniumProject\\Resources");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIyoCu9M6f9gIVy51LBR3k-A6zEAAYASAAEgIpwvD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007786%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D9231400723195304245%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
       WebElement Email= driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
       Email.sendKeys("prkamble79@gmail.com");
	}

}
