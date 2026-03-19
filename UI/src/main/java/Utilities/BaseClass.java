package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseClass
{
    private static WebDriver driver;
    //private WaitUtils wait = new WaitUtils(driver);

    public static WebDriver getDriver()
    {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ZERO);
        }

        return driver;

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
    }

    public void openWebsite(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public String getRequiredText(By locator)
    {
        return findTheElement(locator).getText();
    }

    public void enterTextInField(By locator, String text)
    {
        findTheElement(locator).sendKeys(text);
    }

    public Boolean elementIsDisplayed(By locator)
    {
        return findTheElement(locator).isDisplayed();
    }

    public void clickElement(By locator)
    {
        findTheElement(locator).click();
    }

    public void clickElement(WebElement ele)
    {
        ele.click();
    }

    public String getAttributeValue(By locator, String attribute)
    {
        return findTheElement(locator).getAttribute(attribute);
    }

    public String getAttributeValue(WebElement ele, String attribute)
    {
        return ele.getAttribute(attribute);
    }

    public void selectTextFromDropdown(By locator, String textToSelect)
    {
        Select select = new Select(findTheElement(locator));
        select.selectByValue(textToSelect);
    }

    public List<WebElement> getListOfElements(By locator)
    {
        return driver.findElements(locator);
    }

    public WebElement findTheElement(By locator)
    {
        return driver.findElement(locator);
    }

    public void switchToFrame()
    {
        //driver.switchTo().frame();
    }

}
