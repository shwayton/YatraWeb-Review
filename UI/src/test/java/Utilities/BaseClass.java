package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass
{
    public WebDriver driver;
    public WebDriver getDriver()
    {
        WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        return driver;
    }

//    public WebDriver getDriver(String browser)
//    {
//        if(browser.equalsIgnoreCase("Chrome"))
//            driver = WebDriverManager.chromedriver().getWebDriver();
//
//        else if(browser.equalsIgnoreCase("Firefox"))
//            driver = WebDriverManager.firefoxdriver().getWebDriver();
//
//        else if(browser.equalsIgnoreCase("safari"))
//            driver = WebDriverManager.safaridriver().getWebDriver();
//
//        return driver;
//    }

    public void openWebsite(String url) throws InterruptedException
    {

        driver.get(url);

        driver.manage().window().maximize();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public String getRequiredText(WebElement ele)
    {
        return ele.getText();
    }

    public void enterTextInField(WebElement ele, String text)
    {
        ele.sendKeys(text);
    }

    public Boolean elementIsDisplayed(WebElement ele)
    {
        return ele.isDisplayed();
    }

    public void clickElement(WebElement ele)
    {
        ele.click();
    }

    public void switchToFrame()
    {
        //driver.switchTo().frame();
    }

}
