package com.test.fitpeo;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fitpeo.pages.HomePage;
import com.fitpeo.pages.RevenueCalculatorPage;


public class FitpeoTest {
	
	private WebDriver driver;
    private HomePage homePage;
    private RevenueCalculatorPage revenueCalculatorPage;

    @BeforeTest
    public void setUp() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fitpeo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Initialize Page Objects
        homePage = new HomePage(driver);
    }

    @Test
    public void fitPeoTest() throws InterruptedException, AWTException {
        SoftAssert soft = new SoftAssert();

        revenueCalculatorPage = homePage.goToRevenueCalculator(); // Navigate to Revenue Calculator


        revenueCalculatorPage.adjustSlider(820);// Adjust slider to the value 820

        
        revenueCalculatorPage.updateSliderValue("560");// Update the slider value to '560'

        
        soft.assertEquals(driver.findElement(By.xpath("//input[@type='range']")).getAttribute("aria-valuenow"), "560");// Validate if the slider is adjusted to the value entered in the input field

        
        revenueCalculatorPage.selectCPTCodes();// Select the CPT codes

        // Validate if total recurring reimbursement value is 110700
        String totalText = revenueCalculatorPage.getTotalRecurringReimbursementText();
        System.out.println("Total Recurring Reimbursement Text: " + totalText); // Print text for debugging
        soft.assertTrue(totalText.contains("110700"), "Expected total reimbursement text to contain '110700', but found: " + totalText);

        soft.assertAll();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}