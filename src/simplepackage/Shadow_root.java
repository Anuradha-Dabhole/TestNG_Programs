package simplepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shadow_root {
@Test
public void Airline() 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.airindia.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	WebElement cookies=driver.findElement(By.xpath("//button[.='Accept All']"));
	cookies.click();
	String a1="return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('div > div:nth-child(1) > label')";
	WebElement e2=(WebElement) driver.executeScript(a1);
	e2.click();
	
	//WebElement e3=driver.findElement(By.name("one"));
	//e3.click();
	}
}//selenium IDE,selenium Grid component of selenium...beta env is used to checking the last stage working fine or of before the releasing production time
