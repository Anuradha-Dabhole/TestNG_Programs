package simplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Googlesearchwith_Dp 
{
	@DataProvider(name="data1")
	public Object[] [] method1()
	{
		return new Object[][] {{"Modi"},{"Air Pollution"},{"Bangalore"},{"SRK"}};
	}
	@Test(dataProvider="data1")
	
	
	@DataProvider(name="data2")
	public Object[] [] method2()
	{
		return new Object[][] {{"11"},{"12"},{"23"},{"24"}};
	}
	@Test(dataProvider="data2")
	
		

public void Googlesearch(String output)
{
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys(output);
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

}
}

