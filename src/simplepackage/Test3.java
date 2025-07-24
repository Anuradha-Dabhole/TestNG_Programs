package simplepackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void testcase1()
{
	System.out.println("Test case 1");
	
}
@Test
public void testcase2()
{
	System.out.println("Test case 2");
}
@BeforeMethod
public void launch()
{
	System.out.println("Lanuch browser");
}
@AfterMethod
public void quite()
{
	System.out.println();
}
}
