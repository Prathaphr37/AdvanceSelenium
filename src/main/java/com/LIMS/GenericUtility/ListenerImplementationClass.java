package com.LIMS.GenericUtility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListenerImplementationClass implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test = report.createTest(MethodName);
		Reporter.log(MethodName+"   Test Script Execution is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"----> Passed");
		Reporter.log(MethodName+" Test Script Executed Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName =result.getMethod().getMethodName();
		test.log(Status.FAIL,MethodName+"-----> Failed");
		JavaUtility jLib = new JavaUtility();
		String FailedScript = MethodName+jLib.getSystemDateAndTimeInFormat();
//		String FailedScript = MethodName+new JavaUtility().getSystemDateAndTimeInFormat();
		
		EventFiringWebDriver eDriver =new EventFiringWebDriver(BaseClass.sDriver);
		File src = eDriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+FailedScript+".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log(FailedScript+"  Screenshot Captured Successfully");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"----> skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(MethodName+" Test Script Execution Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		//Execution starts here
		//configure the report
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("./ExtentReport/report.html");
//		ExtentSparkReporter htmlReport = new ExtentSparkReporter(fileName);
		htmlReport.config().setDocumentTitle("LIFE INSURANCE MANAGEMENT SYSTEM PROJECT REPORT");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("LIMS EXECUTION REPORT");
		
		report = new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Operating_System", "windows");
		report.setSystemInfo("Base_Browser","chrome");
		report.setSystemInfo("Base_url","http://rmgtestingserver/domain/Life_Insurance_Management_System/");
		report.setSystemInfo("Reporter_Name","PRATHAP H R");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//consolidate all the parameters and generate the report
		report.flush();
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	
}
