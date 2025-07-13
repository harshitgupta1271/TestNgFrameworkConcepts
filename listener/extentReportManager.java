package listner;

// Importing TestNG interfaces
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

// Importing ExtentReports classes
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent;              // Main class to manage report
    public ExtentTest test;                   // Logs each test case

    @Override
    public void onStart(ITestContext context) {
        // Create HTML report at projectDir/reports/myReport.html
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");

        // Set report configurations
        sparkReporter.config().setDocumentTitle("Automation Report");       // Title on browser tab
        sparkReporter.config().setReportName("Functional Testing");         // Name of the report
        sparkReporter.config().setTheme(Theme.DARK);                        // Theme (DARK/LIGHT)

        // Initialize ExtentReports and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Add system info to report
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Harshit");
        extent.setSystemInfo("OS", "macOS");
        extent.setSystemInfo("Browser", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Case FAILED: " + result.getName());
        test.log(Status.FAIL, "Reason: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Case SKIPPED: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // Save and generate the final report
    }
}
