package simplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class HardAssertion {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        Assertion A1=new Assertion();//HardAssert
        A1.assertEquals(true, true);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe",Keys.ENTER);

       /* SoftAssert s1=new SoftAssert();//SoftAssert
        s1.assertEquals(true, true);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe",Keys.ENTER);
        s1.assertEquals(true, false);
        s1.assertAll();//it note down the all failure exception*/
	}

}
