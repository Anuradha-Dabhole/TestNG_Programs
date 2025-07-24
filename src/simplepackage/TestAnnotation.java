package simplepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation
{
	@BeforeSuite
	public void AB()
	{
		System.out.println("Beforesuite");
	}
	@BeforeTest
	public void CD()
	{
		System.out.println("BeforeTest");

	}
	@BeforeClass
	public void EF()
	{
		System.out.println("BeforeClass");

	}
	@BeforeMethod
	public void GH()
	{
		System.out.println("BeforeMethod");
	
	}
	
	
	@AfterMethod
	public void BA()
	{
		System.out.println("@AfterMethod");

	}
	@AfterClass
	public void DC()
	{
		System.out.println("@@AfterClass");

	}
	@AfterTest
	public void FE()
	{
		System.out.println("@AfterTest");

	}
	@AfterSuite
	public void HG()
	{
		System.out.println("@AfterSuite");

	}
	@Test
	public void XY()
	{
		System.out.println("Test");

	}
	
	
	
	
	
	
	
	
	
	
	

}
