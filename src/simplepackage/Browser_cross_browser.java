package simplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Browser_cross_browser {
WebDriver driver;
@Test
public void launch_browser()
{
	if(1==1)
	{
	 new ChromeDriver();
	}
	if(1>1)
	{
 new EdgeDriver();
	}
}

}
