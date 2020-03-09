package com.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestBase {
	
	public int Response_Status_Code_200 = 200;
	public int Response_Status_Code_500 = 500;
	public int Response_Status_Code_400 = 400;
	public int Response_Status_Code_401 = 401;
	public int Response_Status_Code_201 = 201;
	
	public Properties prop;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/QA/Config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeSuite
	public void beforeSuite() {
		extent = ExtentManager.getInstance();
	}
	
	@BeforeClass
	public void beforeClass() {
		test = extent.createTest(getClass().getName());
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		test.log(Status.INFO, method.getName() +" test started");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getTestName()+"is Pass");
		}else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, result.getThrowable());
		}
		
		extent.flush();
		
	}

}
