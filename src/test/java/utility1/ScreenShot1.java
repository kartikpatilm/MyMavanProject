package utility1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//import org.apache.commons.lang3.time.CalendarUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void captureScreen(WebDriver driver, String name) throws IOException {
		// Step 1 Loction to store
		String path = System.getProperty("user.dir") + "\\Screenshots1\\" + "_" + getCurrentDate() + "name" + ".jpg";

		// Step -2 Using take screnshot reference
		TakesScreenshot tss = (TakesScreenshot) driver;

		// Step 3
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);

		// Step-4 Using File Object
		File destinationFile = new File(path);

		// step-5 using file handler.
		FileHandler.copy(sourceFile, destinationFile);
	}

	public static String getCurrentDate() {
		DateFormat date = new SimpleDateFormat("DD-MM-YYYY hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String currentDate = date.format(cal.getTime());
		return (currentDate);
	}

	
	/*
	 * public static void main(String[] args) {
	 * System.out.println(getCurrentDate()); System.out.println(captureScreen()); }
	 */
	 
}
