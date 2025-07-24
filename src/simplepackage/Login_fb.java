package simplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_fb {
	@DataProvider(name = "Logindetails")
	public Object[][] method1() {

	Object data[][] = new Object[4][2];
		// my first test case1
		data[0][0] = "stbymkt@gmail.com";// valid us
		data[0][1] = "stby123";// valid pass
		

		// my 2nd test case2
		data[1][0] = "stbymkt@gmail.com";// valid us
		data[1][1] = "stby12";// Invalid pass
		

		// my 3rd test case3
		data[2][0] = "stbymkt@gail.com";// Invalid us
		data[2][1] = "stby123";// valid pass
		

		// my 4th test case4
		data[3][0] = "";// Invalid us
		data[3][1] = "";// Invalid pass
		return data;
	
	}

	
	
	@Test(dataProvider = "Logindetails")
	public void log_fb(String Username, String Password) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
}
