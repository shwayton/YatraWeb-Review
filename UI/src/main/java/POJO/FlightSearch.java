package POJO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearch {

    // ================= LOCATORS =================

    private By flightsTab = By.xpath("//button/span[text() = 'Flights']");
    private By hotelsTab = By.xpath("//button/span[text() = 'Hotels']");
    private By holidaysTab = By.xpath("//button/span[text() = 'Holidays']");
    private By busTab = By.xpath("//button/span[text() = 'Bus']");
    private By trainsTab = By.xpath("//button/span[text() = 'Trains']");
    private By cabsTab = By.xpath("//button/span[text() = 'Cabs']");

    private By oneWayBtn = By.xpath("//h4[text() = 'One Way']//ancestor::label");
    private By roundTripBtn = By.xpath("//h4[text() = 'Round Trip']//ancestor::label");
    private By multiCityBtn = By.xpath("//h4[text() = 'Multi City']//ancestor::label");

    private By departsFromField = By.xpath("//div[contains(@aria-label, 'Departure From')]");
    private By goingToField = By.xpath("//div[contains(@aria-label, 'Going To')]");

    private By departureCity = By.xpath("//label[text()='Departure From']//parent::div[1]//input");
    private By departureCityList = By.xpath("//div[contains(@aria-label, 'Departure From')]//following-sibling::div//span");

    private By goToCity = By.xpath("//label[text()='Going To']//parent::div[1]//input");
    private By goToCityList = By.xpath("//div[contains(@aria-label, 'Going To')]//following-sibling::div//span");

    private By departureDate = By.xpath("//div[@aria-label='Departure Date inputbox']");
    private By returnDate = By.xpath("//div[@aria-label = 'Return Date inputbox']");

    private By monthNames = By.xpath("//div[@class='react-datepicker__month-container']/div//button[@aria-label = 'Previous Month']//following-sibling::span");

    private By currentMonthYear = By.xpath("(//button[@aria-label = 'Previous Month']//following-sibling::span)[1]");

    private By nextMonthBtn = By.xpath("//button[@aria-label = 'Next Month' and not (@style)]");

    private By travellerAndClass = By.xpath("//div[@aria-label='Travellers class inputbox']");

    private By noOfAdults = By.xpath("//div[@id = 'traveller_container']//p[@aria-label = 'Adult']/following-sibling::div/ul/li");
    private By noOfChildren = By.xpath("//div[@id = 'traveller_container']//p[@aria-label = 'Child']/following-sibling::div/ul/li");
    private By noOfInfants = By.xpath("//div[@id = 'traveller_container']//p[@aria-label = 'Infant']/following-sibling::div/ul/li");

    private By travelClass = By.xpath("//p[contains(text(),'Choose Travel Class')]/following-sibling::div/label");

    private By travelDetailsDone = By.xpath("//button[text()='Done']");
    private By searchButton = By.xpath("//button[text()='Search']");

    private By regularFareType = By.xpath("//div[contains(@aria-label,'Regular')]");
    private By studentFareType = By.xpath("//div[contains(@aria-label,'Student')]");
    private By seniorCitizenFareType = By.xpath("//div[contains(@aria-label,'Senior Citizen')]");
    private By armedForcesFareType = By.xpath("//div[contains(@aria-label,'Armed Forces')]");

    private By nonStopFlightsBtn = By.xpath("//span[text()='Non-Stop Flights']");
    private By closePopup = By.xpath("//span[@class='style_cross__q1ZoV']/img");

    private By addAnotherCity = By.xpath("//button[contains(text(),'Add Another City')]");
    private By multiCityDeparture = By.xpath("//div[contains(@aria-label,'From')]");
    private By multiCityArrival = By.xpath("//div[contains(@aria-label,'To')]");
    private By removeCity = By.xpath("//button[text()='Remove']");
    private By multiCityList = By.id("input-with-icon-adornment");

    // ================= RETURN LOCATORS =================


    public By getFlightsTab()
    {
        return flightsTab;
    }

    public By getHotelsTab()
    {
        return hotelsTab;
    }

    public By getHolidaysTab()
    {
        return holidaysTab;
    }

    public By getBusTab()
    {
        return busTab;
    }

    public By getTrainsTab()
    {
        return trainsTab;
    }

    public By getCabsTab()
    {
        return cabsTab;
    }

    public By getOneWayBtn()
    {
        return oneWayBtn;
    }

    public By getRoundTripBtn()
    {
        return roundTripBtn;
    }

    public By getMultiCityBtn()
    {
        return multiCityBtn;
    }

    public By getDepartsFromField()
    {
        return departsFromField;
    }

    public By getGoingToField()
    {
        return goingToField;
    }

    public By getDepartureCity()
    {
        return departureCity;
    }

    public By getDepartureCityList()
    {
        return departureCityList;
    }

    public By getGoToCity()
    {
        return goToCity;
    }

    public By getGoToCityList()
    {
        return goToCityList;
    }

    public By getDepartureDate()
    {
        return departureDate;
    }

    public By getReturnDate()
    {
        return returnDate;
    }

    public By getMonthNames()
    {
        return monthNames;
    }

    public By getCurrentMonthYear()
    {
        return currentMonthYear;
    }

    public By getNextMonthBtn()
    {
        return nextMonthBtn;
    }

    public By getTravellerAndClass()
    {
        return travellerAndClass;
    }

    public By getNoOfAdults()
    {
        return noOfAdults;
    }

    public By getNoOfChildren()
    {
        return noOfChildren;
    }

    public By getNoOfInfants()
    {
        return noOfInfants;
    }

    public By getTravelClass()
    {
        return travelClass;
    }

    public By getTravelDetailsDone()
    {
        return travelDetailsDone;
    }

    public By getSearchButton()
    {
        return searchButton;
    }

    public By getRegularFareType()
    {
        return regularFareType;
    }

    public By getStudentFareType()
    {
        return studentFareType;
    }

    public By getSeniorCitizenFareType()
    {
        return seniorCitizenFareType;
    }

    public By getArmedForcesFareType()
    {
        return armedForcesFareType;
    }

    public By getNonStopFlightsBtn()
    {
        return nonStopFlightsBtn;
    }

    public By getClosePopup()
    {
        return closePopup;
    }

    public By getAddAnotherCity()
    {
        return addAnotherCity;
    }

    public By getMultiCityDeparture()
    {
        return multiCityDeparture;
    }

    public By getMultiCityArrival()
    {
        return multiCityArrival;
    }

    public By getRemoveCity()
    {
        return removeCity;
    }

    public By getMultiCityList()
    {
        return multiCityList;
    }
}