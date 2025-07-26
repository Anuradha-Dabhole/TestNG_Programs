package simplepackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Methods 
{
@Test
public void asserts_m()
{
	//Assert.assertTrue(false);// test case failed
	//Assert.assertTrue(true);//test case pass becoz expected value get
	//Assert.assertFalse(false);//test case pass becoz expected value get
	//Assert.assertFalse(true);// test case failed
	//Assert.assertEquals(false,false);//test case pass becoz expected value get
	Assert.assertEquals(false,true);//test case failed
}
}
