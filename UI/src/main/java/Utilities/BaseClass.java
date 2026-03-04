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

//    public void clickElement(WebElement ele)
//    {
//        ele.click();
//    }

    public void clickElement(WebElement ele) {
        //WaitUtils wait = new WaitUtils(driver);
        //wait.waitForClickable(ele).click();
        WaitUtils.waitForClickable(ele).click();
    }

    public String getAttributeValue(WebElement ele, String attribute)
    {
        return ele.getAttribute(attribute);
    }

    public void selectTextFromDropdown(WebElement ele, String textToSelect)
    {
        Select select = new Select(ele);
        select.selectByValue(textToSelect);
    }

    public List<WebElement> getListOfElements(String xpath)
    {
        return driver.findElements(By.xpath(xpath));
    }

    public WebElement findTheElement(String xpath)
    {
        return WaitUtils.waitForVisible(driver.findElement(By.xpath(xpath)));
        //return driver.findElement(By.xpath(xpath));
    }

    public void switchToFrame()
    {
        //driver.switchTo().frame();
    }

}
