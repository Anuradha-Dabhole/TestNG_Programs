package simplepackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_class 
{
	
	@Test
	public void testcase()
	{
		Assert.assertEquals(driver.gettitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

}
