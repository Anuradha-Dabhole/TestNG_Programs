package practiceselenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Firstclass4 {

	public static void main(String[] args) 
	{
		EdgeDriver conductor=new EdgeDriver();
		conductor.get("https://www.google.com");
             String title=conductor.getTitle();
             System.out.println(title);
	}

}
