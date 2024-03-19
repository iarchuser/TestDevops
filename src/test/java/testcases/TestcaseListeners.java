package testcases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestcaseListeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started. Details are - " +  result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case successful. Details are - " +  result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case Failed. Details are - " +  result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case skipped. Details are - " +  result.getName());
	}
}
