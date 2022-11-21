package com.LIMS.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementationClass implements IRetryAnalyzer {

	int count = 0;
	int RetryLimit = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		if (count < RetryLimit )
		{
			count++;
			return true;
		}
		return false;
	}

}
