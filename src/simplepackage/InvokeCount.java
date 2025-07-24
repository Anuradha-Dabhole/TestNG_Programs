package simplepackage;

import org.testng.annotations.Test;

public class InvokeCount {
@Test(invocationCount=10)
public void login()
{
	System.out.println("Running login test");
}
}
