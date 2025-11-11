package com.frameium.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryListener implements ITestListener {

	/*
	 * public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2,
	 * Method arg3) { IRetryAnalyzer retry = arg0.getRetryAnalyzer(); if(retry ==
	 * null){ arg0.setRetryAnalyzer(Retry.class); } }
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		IRetryAnalyzer retryAnalyzer = result.getMethod().getRetryAnalyzer(result);
		if (retryAnalyzer != null) {
			retryAnalyzer.retry(result);
		}

//	public  void trasform(ITestAnnotation annotation,Class testclass,Constructor testConstructor,Method testMethod){
//		annotation.setRetryAnalyzer(Retry.class);
//	}

	}
	@Override
	public void onTestSkipped(ITestResult result) {}
	@Override
	public void onTestSuccess(ITestResult result) {}
	@Override
	public void onStart(ITestContext context) {}
	@Override
	public void onFinish(ITestContext context) {}
}