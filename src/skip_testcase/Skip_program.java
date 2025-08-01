package skip_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_program
{
@Test
public void login()
{
Assert.assertTrue(false);
}
@Test(dependsOnMethods="login")//logout method is depend on login method
public void logout()
{
	
}

}
