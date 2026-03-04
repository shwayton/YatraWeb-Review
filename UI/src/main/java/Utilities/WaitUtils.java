package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static WebElement waitForClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(15));
        wait.ignoring(StaleElementReferenceException.class);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


//    public WebElement waitForClickable(WebElement element) {
//        return wait
//                .ignoring(StaleElementReferenceException.class)
//                .until(ExpectedConditions.elementToBeClickable(element));
//    }

    public WebElement waitForVisible(WebElement element) {
        return wait
                .ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOf(element));
    }
}