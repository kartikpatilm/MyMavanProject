package utility1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests1.LoginTest1;

public class TestListeners1 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
try {
	ScreenShot1.captureScreen(LoginTest1.driver, result.getName());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	}
}
