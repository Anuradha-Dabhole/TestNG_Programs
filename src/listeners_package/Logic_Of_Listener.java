package listeners_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import practiceselenium.Amazon_Autosuggestion;

public class Logic_Of_Listener implements ITestListener
{
	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is Pass");
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\photo"+ Math.random() + ".png");//give the only screenshot with random number
		File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\Pass\\photo"+ new Amazon_Autosuggestion().getClass() +".png");//create object of the child class & write method it will give the package name & class name
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is Fail");
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\photo"+ Math.random() + ".png");//give the only screenshot with random number
		File destination = new File("C:\\Users\\Dell Latitude 3400\\eclipse-workspace\\Selenium1\\Screenshot\\Fail\\photo"+ new Amazon_Autosuggestion().getClass() +".png");//create object of the child class & write method it will give the package name & class name
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
