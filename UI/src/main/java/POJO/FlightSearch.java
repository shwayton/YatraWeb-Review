package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightSearch
{

    private WebDriver driver;

    public FlightSearch(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//button/span[text() = 'Flights']")
    WebElement flightsTab;

    @FindBy (xpath = "//button/span[text() = 'Hotels']")
    WebElement hotelsTab;

    @FindBy (xpath = "//button/span[text() = 'Holidays']")
    WebElement holidaysTab;

    @FindBy (xpath = "//button/span[text() = 'Bus']")
    WebElement busTab;

    @FindBy (xpath = "//button/span[text() = 'Trains']")
    WebElement trainsTab;

    @FindBy (xpath = "//button/span[text() = 'Cabs']")
    WebElement cabsTab;

    @FindBy(xpath = "//h4[text() = 'One Way']//ancestor::label")
    WebElement oneWayBtn;

    @FindBy(xpath = "//h4[text() = 'Round Trip']//ancestor::label")
    WebElement roundTripBtn;

    @FindBy(xpath = "//h4[text() = 'Multi City']//ancestor::label")
    WebElement multiCityBtn;

    @FindBy(xpath = "//div[contains(@aria-label, 'Departure From')]")
    WebElement departsFromField;

    @FindBy(xpath = "//div[contains(@aria-label, 'Going To')]")
    WebElement goingToField;

    @FindBy(xpath = "//label[text()='Departure From']//following::div[1]")
    WebElement departureCity;

    @FindBy(xpath = "//div[contains(@aria-label, 'Departure From')]//following-sibling::div//span")
    List<WebElement> departureCityList;

     @FindBy(xpath = "//label[text()='Going To']//following::div[1]")
    WebElement goToCity;

    @FindBy(xpath = "//div[contains(@aria-label, 'Going To')]//following-sibling::div//span")
    WebElement goToCityList;

    @FindBy(xpath = "//div[@aria-label='Departure Date inputbox']")
    WebElement departureDate;

    @FindBy(xpath = "//div[@aria-label = 'Return Date inputbox']")
    WebElement returnDate;

    //same for departure and return
    @FindBy(xpath = "//div[@class='react-datepicker__month-container']/div//button[@aria-label = 'Previous Month']//following-sibling::span")
    List<WebElement> monthNames;

    //same for departure and return
    //Need to use the isVisible() method to identify the correct one
    @FindBy(xpath = "//button[@aria-label = 'Next Month']")
    List<WebElement> nextmonthBtn;

    @FindBy(xpath = "//div[@aria-label='Travellers class inputbox']")
    WebElement travelerClass;

    @FindBy(xpath = "//div[@id = 'traveller_container']//p[@aria-label = 'Adult']/following-sibling::div/ul/li")
    WebElement noOfAdults;

    @FindBy(xpath = "//div[@id = 'traveller_container']//p[@aria-label = 'Child']/following-sibling::div/ul/li")
    WebElement noOfChildren;

    @FindBy(xpath = "//div[@id = 'traveller_container']//p[@aria-label = 'Infant']/following-sibling::div/ul/li")
    WebElement noOfInfants;

    @FindBy(xpath = "//p[contains(text(),'Choose Travel Class')]/following-sibling::div/label")
    WebElement travelClass;

    @FindBy(xpath = "//button[text()='Done']")
    WebElement travelDetailsDone;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchButton;

    @FindBy(xpath = "//span[text()='Non-Stop Flights']/parent::label//parent::div/div")
    List<WebElement> fareType;

    @FindBy(xpath = "//span[text()='Non-Stop Flights']")
    WebElement nonStopFlightsBtn;

    public WebElement getSearchButton()
    {
        return searchButton;
    }

    public List<WebElement> getFareType()
    {
        return fareType;
    }

    public WebElement getNonStopFlightsBtn()
    {
        return nonStopFlightsBtn;
    }

    public WebElement getFlightsTab()
    {
        return flightsTab;
    }

    public WebElement getHotelsTab()
    {
        return hotelsTab;
    }

    public WebElement getHolidaysTab()
    {
        return holidaysTab;
    }

    public WebElement getBusTab()
    {
        return busTab;
    }

    public WebElement getTrainsTab()
    {
        return trainsTab;
    }

    public WebElement getCabsTab()
    {
        return cabsTab;
    }

    public WebElement getOneWayBtn()
    {
        return oneWayBtn;
    }

    public WebElement getRoundTripBtn()
    {
        return roundTripBtn;
    }

    public WebElement getMultiCityBtn()
    {
        return multiCityBtn;
    }

    public WebElement getDepartsFromField()
    {
        return departsFromField;
    }

    public WebElement getGoingToField()
    {
        return goingToField;
    }

    public WebElement getDepartureCity()
    {
        return departureCity;
    }

    public List<WebElement> getDepartureCityList()
    {
        return departureCityList;
    }

    public WebElement getGoToCity()
    {
        return goToCity;
    }

    public WebElement getGoToCityList()
    {
        return goToCityList;
    }

    public WebElement getDepartureDate()
    {
        return departureDate;
    }

    public WebElement getReturnDate()
    {
        return returnDate;
    }

    public List<WebElement> getMonthNames()
    {
        return monthNames;
    }

    public List<WebElement> getNextmonthBtn()
    {
        return nextmonthBtn;
    }

    public WebElement getTravelerClass()
    {
        return travelerClass;
    }

    public WebElement getNoOfAdults()
    {
        return noOfAdults;
    }

    public WebElement getNoOfChildren()
    {
        return noOfChildren;
    }

    public WebElement getNoOfInfants()
    {
        return noOfInfants;
    }

    public WebElement getTravelClass()
    {
        return travelClass;
    }

    public WebElement getTravelDetailsDone()
    {
        return travelDetailsDone;
    }
}
