package drivefactory;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import commonfunctions.PBFunctions;
import constant.PBConstant;
import utilities.ReadExcel;
import utilities.TakeScrennShot;

public class DriverScript extends PBConstant {
	// Read Excelpath
	String inputpath = "E:\\AutoSelenium\\AutomationProject\\Input\\Controller.xlsx";
	// Write results
	String outpath = "E:\\AutoSelenium\\AutomationProject\\Output\\keyword.xlsx";
	ExtentReports report;
	ExtentTest test;
	String TCsheet = "TestCases";
	String TSSheet = "TestSteps";

	@Test
	public void primusbank() throws Throwable 
	{
		boolean res = false;
		String tcres = "";
		// access excel util methods
		ReadExcel xl=new ReadExcel(inputpath);
		report = new ExtentReports("./Reports/keyword.html");
		// count no of rows in TCsheet
		int TCcount = xl.rowCount(TCsheet);
		System.out.println(TCcount);
		// count no of rows in Tssheet
		int TScount = xl.rowCount(TSSheet);
		System.out.println(TScount);
		// iterate test case sheet
		for (int i = 1; i <= TCcount; i++) {
			// read execute column
			String execute = xl.cellData(TCsheet, i, 2);
			if (execute.equalsIgnoreCase("Y")) {
				// read TestCase Id from TC Sheet
				String Tcids = xl.cellData(TCsheet, i, 0);
				// iterate all rows in TSSheet
				for (int j = 1; j <= TScount; j++) {
					// start test case
					test = report.startTest("PrimusBank");
					test.assignAuthor("Danish QA Analyst");
					// read description column
					String description = xl.cellData(TSSheet, j, 2);
					// read TestCase Id from TSSheet
					String TSids = xl.cellData(TSSheet, j, 0);
					if (Tcids.equalsIgnoreCase(TSids)) {
						// read keyword column
						String keyword = xl.cellData(TSSheet, j, 3);
						if (keyword.equalsIgnoreCase("AdminLogin")) {
							// call login method
							res = PBFunctions.verifyLogin("Admin", "Admin");
							test.log(LogStatus.INFO, description);
							TakeScrennShot.screenshot(driver,"Login Page");
						} else if (keyword.equalsIgnoreCase("NewBranchCreation")) {
							PBFunctions.navigateBranch();
							res = PBFunctions.verifyBracnCreation("Srnager342", "Hderabad", "12445", 1, 1, 1);
							test.log(LogStatus.INFO, description);
							TakeScrennShot.screenshot(driver, "Branchcreation");
						} else if (keyword.equalsIgnoreCase("UpdateBranch")) {
							PBFunctions.navigateBranch();
							res = PBFunctions.verifyUpdateBranch("Banglore", "Abc Colony");
							test.log(LogStatus.INFO, description);
							TakeScrennShot.screenshot(driver, "Branch updation");
						} else if (keyword.equalsIgnoreCase("AdminLogout")) {
							res = PBFunctions.verifyLogout();
							test.log(LogStatus.INFO, description);
							TakeScrennShot.screenshot(driver, "Logout");
						}
						String tsres ="";
						if (res) {
							tsres = "PASS";
							// write into result column in TSSheeet
							xl.setData(TSSheet, j, 4, tsres, outpath);
							xl.greenColour(TSSheet, j, 4, outpath);
							test.log(LogStatus.PASS, description);
						} else {
							tsres = "Fail";
							xl.setData(TSSheet, j, 4, tsres, outpath);
							xl.redColour(TSSheet, j, 4, outpath);
							test.log(LogStatus.FAIL, description);
						}
						// if not tcres equal to null then write as pass or fail into tcsheet
						if (!tsres.equalsIgnoreCase("FAIL")) {
							// assign teststep results to testcase results
							tcres = tsres;
						}
					}
					report.endTest(test);
					report.flush();
				}
				xl.setData(TCsheet, i, 3, tcres, outpath);
				if (tcres.equalsIgnoreCase("PASS")) {
					xl.greenColour(TCsheet, i, 3, outpath);
				} else {
					xl.redColour(TCsheet, i, 3, outpath);
				}
			} else {
				// write as not executed
				xl.setData(TCsheet, i, 3, "Not Executed", outpath);
			}
		}
	}

}
