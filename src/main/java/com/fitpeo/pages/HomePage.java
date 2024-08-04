package com.fitpeo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	 private WebDriver driver;
	    private By revenueCalculatorLink = By.xpath("//div[text()='Revenue Calculator']");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public RevenueCalculatorPage goToRevenueCalculator() {
	        driver.findElement(revenueCalculatorLink).click();
	        return new RevenueCalculatorPage(driver);
	    }
}
