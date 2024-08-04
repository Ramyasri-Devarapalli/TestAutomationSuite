package com.fitpeo.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RevenueCalculatorPage {

	private WebDriver driver;
    private By sliderLocator = By.xpath("//input[@type='range']");
    private By sliderValueLocator = By.cssSelector("input.MuiInputBase-input");
    private By totalRecurringReimbursementLocator = By.xpath("//p[contains(text(),'Total Recurring Reimbursement for all Patients Per Month')]/following-sibling::p[contains(text(),'$')]");

    public RevenueCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void adjustSlider(int targetValue) throws AWTException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(sliderLocator));
        WebElement sliderValue = driver.findElement(sliderValueLocator);

        // Scroll till slider value input text field
        Actions actions = new Actions(driver);
        actions.scrollToElement(sliderValue).perform();

        // Adjust slider to the target value
        while (!slider.getAttribute("aria-valuenow").equals(String.valueOf(targetValue))) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            Thread.sleep(50); 
        }
    }

    public void updateSliderValue(String value) throws AWTException {
    	
        WebElement sliderValue = driver.findElement(sliderValueLocator);
        sliderValue.click();
        Robot robot = new Robot();
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        sliderValue.sendKeys(value);
    }

    public void selectCPTCodes() {
        List<String> cptCodes = new ArrayList<>();
        cptCodes.add("CPT-99091");
        cptCodes.add("CPT-99453");
        cptCodes.add("CPT-99454");
        cptCodes.add("CPT-99474");

        // Select the checkboxes of respective CPT codes
        for (String cptCode : cptCodes) {
            driver.findElement(By.xpath("//p[text()='" + cptCode + "']/following-sibling::label//input")).click();
        }
    }

    public String getTotalRecurringReimbursementText() {
        WebElement totalRecurringReimbursement = driver.findElement(totalRecurringReimbursementLocator);
        return totalRecurringReimbursement.getText();
    }
}
