package practiceselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstclass3 {

	public static void main(String[] args) 
	{
		FirefoxDriver conductor=new FirefoxDriver();
		conductor.get("https://www.google.com");
             String title=conductor.getTitle();
             System.out.println(title);
	}

}
