# TestAutomationSuite
FitPeo Maven Project
Overview
This Maven project is designed to test the FitPeo web application using Selenium WebDriver and TestNG. It includes a test script that interacts with the Revenue Calculator page of the application, adjusting sliders, updating text fields, and verifying results.

Project Structure
src/main/java/com/fitpeo/pages: Contains the Page Object Model classes representing the web pages.
HomePage.java
RevenueCalculatorPage.java
src/test/java/com/test/fitpeo: Contains the test classes.
FitpeoTest.java
Prerequisites
Java Development Kit (JDK): Ensure you have JDK 8 or higher installed.
Maven: Ensure Maven is installed.
ChromeDriver: Download the ChromeDriver that matches your Chrome browser version and place it in a directory included in your system's PATH.
Selenium WebDriver: Selenium WebDriver dependencies are managed via Maven in the pom.xml file.
Setup
Clone the Repository

bash
Copy code
git clone <repository-url>
Navigate to Project Directory

bash
Copy code
cd fitpeo-maven-project
Install Dependencies

Use Maven to install the necessary dependencies:

bash
Copy code
mvn install
Configuration
Ensure that the ChromeDriver executable is available in your system's PATH, or update the WebDriver initialization in FitpeoTest.java to specify the path to chromedriver.

Running Tests
To run the test cases:

Run Tests Using Maven

bash
Copy code
mvn test
This command will compile the project, download dependencies, and execute the test cases defined in FitpeoTest.java.

Test Case Details
FitpeoTest.java
Setup (@BeforeTest)

Initializes the ChromeDriver and navigates to the FitPeo homepage.
Initializes the HomePage Page Object.
Test (@Test)

Navigates to the Revenue Calculator page.
Adjusts the slider to a value of 820.
Updates the slider value to 560 through the text field.
Validates that the slider reflects the updated value.
Selects specific CPT codes.
Verifies that the "Total Recurring Reimbursement" value is $110,700.
Teardown (@AfterTest)

Closes the browser and cleans up resources.
RevenueCalculatorPage.java
adjustSlider(int targetValue)

Adjusts the slider to the specified target value.
updateSliderValue(String value)

Updates the slider value using the associated text field.
selectCPTCodes()

Selects checkboxes for predefined CPT codes.
getTotalRecurringReimbursementText()

Retrieves the text displaying the total recurring reimbursement value.
Troubleshooting
Browser Compatibility: Ensure that the ChromeDriver version matches your Chrome browser version.
Element Not Found: Verify that the locators used in the Page Object classes match the elements on the web page. Update the XPath or CSS selectors as necessary.
