package simplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Gmail_doubleclickwithHeadless {

	@Test
	public void my()
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless=new");
		ChromeDriver driver=new ChromeDriver(option);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.linkText("Gmail"));
        Actions a1=new Actions(driver);
       //a1.doubleClick(e1).perform();//Double click
        a1.contextClick(e1).perform();//Right click
		
		
	}

}
