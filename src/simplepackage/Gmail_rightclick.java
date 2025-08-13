package simplepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Gmail_rightclick 
{
@Test
public void right() throws AWTException, InterruptedException {

	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.linkText("Gmail"));
    Actions a1=new Actions(driver);
    a1.contextClick(e1).perform();//Right click
    Robot r1 = new Robot();
    r1.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_DOWN);//it is go to the second option that on right click
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_ENTER);
    




    

}
}
