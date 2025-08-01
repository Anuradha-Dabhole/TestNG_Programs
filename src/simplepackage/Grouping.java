package simplepackage;

import org.testng.annotations.Test;

public class Grouping
{
@Test(groups={"smoke","system"}) 
public void method1() 
{
}
@Test (groups={"integration"}) 
public void method2() 
{
}
@Test (groups={"integration"}) 
public void method3() 
{
}
@Test (groups={"smoke"}) 
public void method4() 
{
}
@Test (groups={"smoke"}) 
public void method5() 
{
}
}
