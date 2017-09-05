package utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {

	public static ExtentReports reportResult() {
		ExtentReports extent;
		String Path = "C:\\Users\\public\\Desktop\\SeleniumTraining\\Reports\\Login_Report.html";
		extent = new ExtentReports(Path, false);
		return extent;

	}

}
