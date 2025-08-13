package listeners_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Logic_Of_Listener.class)
public class Testcase1 extends Logic_Of_Listener{
	 
	@Test
	public void testcase()
	{
		
	
	
	 driver=new ChromeDriver();
    driver.get("https://www.amazon.in");//test case pass
   // driver.get("https://www.google.com");//test case fail

    driver.manage().window().maximize();
    //driver.findElement(By.id("manish")).sendKeys("shoe");

     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
    //driver.findElement(By.id("nav-search-submit-button")).click();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
}
}