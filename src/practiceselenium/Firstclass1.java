package practiceselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
             driver.get("https://www.google.com");
             //String title=driver.getTitle();
             System.out.println(driver.getTitle());
             String window=driver.getWindowHandle();
             System.out.println(window);
             Set<String> window1=driver.getWindowHandles();

             driver.quit();
	}

}
