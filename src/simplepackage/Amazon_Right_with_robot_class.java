package simplepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Right_with_robot_class
{ @Test
	public void my() throws AWTException
	{
	
	ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe",Keys.ENTER);

//Actions a1=new Actions(driver);
//a1.contextClick(e1).perform();//Right click
Robot r1 = new Robot();
WebElement e1=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-spacing-top-base s-slider-container'])"));

r1.keyPress(KeyEvent.VK_RIGHT);
r1.keyPress(KeyEvent.VK_RIGHT);
r1.keyPress(KeyEvent.VK_RIGHT);
r1.keyPress(KeyEvent.VK_RIGHT);
r1.keyPress(KeyEvent.VK_RIGHT);

}
}