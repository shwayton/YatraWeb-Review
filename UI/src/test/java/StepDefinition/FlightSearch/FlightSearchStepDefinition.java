package StepDefinition.FlightSearch;

import POJO.FlightSearch;
import StepDefinition.LoginPage.LoginTextConstants;
import Utilities.*;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class FlightSearchStepDefinition extends BaseClass
{

    FlightSearch flight = new FlightSearch();
    DatePicker dp = new DatePicker();

    @Given("the user is on the Yatra home page")
    public void the_user_is_on_the_yatra_website()
    {
        openWebsite("https://www.yatra.com/");
        //openWebsite("https://www.yatra.com/flights");
        Assert.assertEquals(getPageTitle(), LoginTextConstants.YATRA_TITLE);
    }

    @When("the user selects journey type as {string}")
    public void the_user_selects_journey_type_as(String journeyType)
    {
        clickElement(flight.getClosePopup());

        switch (journeyType) {
            case "one-way":
                clickElement(flight.getOneWayBtn());
                break;

            case "round-trip":
                clickElement(flight.getRoundTripBtn());
                break;

            case "multi-city":
                clickElement(flight.getMultiCityBtn());
                break;
        }

    }

    @When("^the user enters \"([^\"]*)\" as \"([^\"]*)\"$")
    public void the_user_enters_as_source_city(String city, String field)
    {
        if (field.equalsIgnoreCase("fromCity")) {
            clickElement(flight.getDepartsFromField());
            enterTextInField(flight.getDepartureCity(), city);

            List<WebElement> ele = getListOfElements(flight.getDepartureCityList());

            for (int i = 0; i < ele.size() - 1; ) {

                if (ele.get(i).getText().equalsIgnoreCase(city)) {
                    clickElement(ele.get(i));
                    break;
                }

                i = i + 2;
            }
        } else if (field.equalsIgnoreCase("destination_city")) {
            clickElement(flight.getGoingToField());
            enterTextInField(flight.getGoToCity(), city);

            List<WebElement> ele = getListOfElements(flight.getGoToCityList());
            for (int i = 0; i < ele.size() - 1; ) {

                if (ele.get(i).getText().equalsIgnoreCase(city)) {
                    clickElement(ele.get(i));
                    break;
                }

                i = i + 2;
            }
        }
    }

    @When("^the user selects \"([^\"]*)\" \"([^\"]*)\"")
    public void the_user_selects_departure_date(String typeOfDate, String date)
    {
        //15-03-2026

        if (typeOfDate.equalsIgnoreCase("departureDate")) {
            clickElement(getListOfElements(flight.getDepartureDate()).getFirst());
            dp.selectDate(date);
        } else if (typeOfDate.equalsIgnoreCase("returnDate")) {
            //clickElement(flight.getReturnDate());
            dp.selectDate(date);
        }
    }

    @When("the user selects {string} adults, {string} children and {string} infants")
    public void the_user_selects_adults_children_and_infants(String adults, String children, String infants) throws InterruptedException
    {
        //findTheElement("//div[@aria-label='Travellers class inputbox']").click();
        clickElement(WaitUtils.waitForClickable(flight.getTravellerAndClass()));

        if (Integer.parseInt(adults) <= 0)
            System.out.println("Select atleast one adult");
        else {
            clickElement(getListOfElements(flight.getNoOfAdults()).get(Integer.parseInt(adults) + 1));

            if (Integer.parseInt(children) > 0) {
                if (Integer.parseInt(children) <= (9 - Integer.parseInt(adults))) {
                   // clickElment(WaitUtils.waitForClickable(By.xpath("")));
                    clickElement(getListOfElements(flight.getNoOfChildren()).get(Integer.parseInt(children)));
                }
                else
                    System.out.println("Please select less number of children");
            }

            if (Integer.parseInt(infants) > 0) {
                if (!(Integer.parseInt(infants) > Integer.parseInt(adults)))
                    clickElement(getListOfElements(flight.getNoOfInfants()).get(Integer.parseInt(infants)));
                else
                    System.out.println("Number of infants should be less than number of adults");
            }
        }

    }

    @When("the user selects fare type {string}")
    public void the_user_selects_fare_type(String fareType)
    {
        switch (fareType) {
            case "Regular":
                clickElement(flight.getRegularFareType());
                break;

            case "Student":
                clickElement(flight.getStudentFareType());
                break;

            case "Armed Forces":
                clickElement(flight.getArmedForcesFareType());
                break;

            case "Senior Citizen":
                clickElement(flight.getSeniorCitizenFareType());
                break;
        }
    }

    @When("the user clicks on Search Flights")
    public void the_user_clicks_on_search_flights()
    {
        clickElement(flight.getSearchButton());
    }

    @Then("the user should see the list of available one-way flights")
    public void the_user_should_see_the_list_of_available_one_way_flights()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("the user should see the list of available {string} flights")
    public void theUserShouldSeeTheListOfAvailableRoundTripFlights(String journeyType)
    {

    }

    @Then("the user should see an error message stating {string}")
    public void theUserShouldSeeAnErrorMessageStating(String arg0)
    {

    }

    @And("the user enters city pair {int} {string} to {string} with date {string}")
    public void theUserEntersFirstCityPairToWithDate(int pairNo, String fromCity, String toCity, String date) throws InterruptedException, IOException
    {
        String cityXPath = "";

        clickElement(getListOfElements(flight.getMultiCityDeparture()).get(pairNo-1));
        enterTextInField(flight.getMultiCityList(),fromCity);
        cityXPath = "//li//span[text()='"+fromCity+"']";
        clickElement(WaitUtils.waitForClickable(By.xpath(cityXPath)));
        
        clickElement(getListOfElements(flight.getMultiCityArrival()).get(pairNo-1));
        enterTextInField(flight.getMultiCityList(),toCity);
        cityXPath = "//li//span[text()='"+toCity+"']";
        clickElement(WaitUtils.waitForClickable(By.xpath(cityXPath)));

        clickElement(getListOfElements(flight.getDepartureDate()).get(pairNo-1));
        dp.selectDate(date);

    }

    @And("the user selects {string}")
    public void theUserSelects(String travelClass)
    {
        for (WebElement ele : getListOfElements(flight.getTravelClass())){
            if(getAttributeValue(ele, AttributeValue.ARIA_LABEL).equalsIgnoreCase(travelClass)) {
                clickElement(ele);
                //clickElement(getDriver().findElement(By.xpath()));
                break;
            }
        }
        //clickElement(flight.getTravelDetailsDone());
    }


    @And("the user enters city pair {string}")
    public void theUserEntersCityPairWithDate(String blockID) throws IOException
    {
        String cityXPath = "";
        int pairNo = Integer.parseInt(blockID);

        List<CityList> list = TestDataLoader.getTravelDetails();

        for(CityList li : list)
        {
            if(li.getId().equalsIgnoreCase(blockID))
            {
                clickElement(getListOfElements(flight.getMultiCityDeparture()).get(pairNo-1));
                enterTextInField(flight.getMultiCityList(),li.getFrom_city());
                cityXPath = "//li//span[text()='"+li.getFrom_city()+"']";
                clickElement(WaitUtils.waitForClickable(By.xpath(cityXPath)));


                clickElement(getListOfElements(flight.getMultiCityArrival()).get(pairNo-1));
                enterTextInField(flight.getMultiCityList(),li.getTo_city());
                cityXPath = "//li//span[text()='"+li.getTo_city()+"']";
                clickElement(WaitUtils.waitForClickable(By.xpath(cityXPath)));

                clickElement(getListOfElements(flight.getDepartureDate()).get(pairNo-1));

                dp.selectDate(li.getDeparture_date());
                break;
            }
        }

    }

}
