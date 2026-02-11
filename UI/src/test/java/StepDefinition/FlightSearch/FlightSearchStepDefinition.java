package StepDefinition.FlightSearch;

import POJO.FlightSearch;
import Utilities.BaseClass;
import Utilities.DatePicker;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FlightSearchStepDefinition extends BaseClass
{

    WebDriver driver = getDriver();
    FlightSearch flight = new FlightSearch(driver);


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

            for (int i = 0; i < flight.getDepartureCityList().size() - 1; ) {
                List<WebElement> ele = flight.getDepartureCityList();

                if (ele.get(i).getText().equalsIgnoreCase(city))
                    clickElement(ele.get(i));

                i = i + 2;
            }
        } else if (field.equalsIgnoreCase("destination_city")) {
            clickElement(flight.getGoingToField());
            enterTextInField(flight.getGoToCity(), city);

            for (int i = 0; i < flight.getGoToCityList().size() - 1; ) {
                List<WebElement> ele = flight.getGoToCityList();

                if (ele.get(i).getText().equalsIgnoreCase(city))
                    clickElement(ele.get(i));

                i = i + 2;
            }
        }
    }

    @When("^the user selects \"([^\"]*)\" \"([^\"]*)\"")
    public void the_user_selects_departure_date(String typeOfDate, String date)
    {
        //15-03-2026
        DatePicker dp = new DatePicker();

        if (typeOfDate.equalsIgnoreCase("departureDate")) {
            clickElement(flight.getDepartureDate());
            dp.selectDate(date);
        } else if (typeOfDate.equalsIgnoreCase("returnDate")) {
            clickElement(flight.getReturnDate());
            dp.selectDate(date);
        }
    }

    @When("the user selects {string} adults, {string} children and {string} infants")
    public void the_user_selects_adults_children_and_infants(String adults, String children, String infants)
    {
        clickElement(flight.getTravellerAndClass());

        if (Integer.parseInt(adults) <= 0)
            System.out.println("Select atleast one adult");
        else {
            clickElement(flight.getNoOfAdults().get(Integer.parseInt(adults) + 1));

            if (Integer.parseInt(children) > 0) {
                if (Integer.parseInt(children) <= (9 - Integer.parseInt(adults)))
                    clickElement(flight.getNoOfAdults().get(Integer.parseInt(children)));
                else
                    System.out.println("Please select less number of children");
            }

            if (Integer.parseInt(infants) > 0) {
                if (!(Integer.parseInt(infants) > Integer.parseInt(adults)))
                    clickElement(flight.getNoOfAdults().get(Integer.parseInt(infants)));
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

    @And("the user enters first city pair {string} to {string} with date {string}")
    public void theUserEntersFirstCityPairToWithDate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5)
    {

    }

    @And("the user enters second city pair {string} to {string} with date {string}")
    public void theUserEntersSecondCityPairToWithDate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5)
    {
    }

    @And("the user selects {string}")
    public void theUserSelects(String travelClass)
    {
        for (WebElement ele : flight.getTravelClass()) {
            if (ele.getAttribute("aria-label").equalsIgnoreCase(travelClass))
                clickElement(ele);
        }
        clickElement(flight.getTravelDetailsDone());
    }
}
