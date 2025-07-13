
ExtentReports – Theory Revision

What is ExtentReports?
ExtentReports is an open-source reporting library used to generate detailed and interactive HTML reports for automated test execution. It provides real-time logging and rich visualization of test results.

Why Use ExtentReports?
Creates visually appealing and customizable test reports.
Tracks status: pass, fail, skip.
Logs additional info: system details, author, screenshots, etc.
Integrates well with TestNG, JUnit, Selenium, etc.
Key Components:
ExtentReports
Main class that manages the report.
ExtentSparkReporter
Responsible for creating the HTML file.
ExtentTest
Represents individual test cases and logs test steps.
How It Works with TestNG:
A listener class (implements ITestListener) is used to hook into the test lifecycle (start, success, failure, etc.).
ExtentSparkReporter is configured for output path, title, and theme.
ExtentReports is attached to the Spark reporter.
Test statuses are logged using ExtentTest in the respective listener methods.
TestNG Listener Methods Used:
onStart() – Initializes report setup before tests start.
onTestSuccess() – Logs passed tests.
(Other optional methods: onTestFailure(), onTestSkipped(), onFinish() for full logging coverage.)
Output:
Generates a report like myReport.html in a specified folder (e.g., /reports).
Viewable in any browser with categorized and filterable test logs.
