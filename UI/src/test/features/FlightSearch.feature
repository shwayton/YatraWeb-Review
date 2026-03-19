Feature: Search for a flight with required details


  Scenario Outline: User searches one-way flight successfully
    Given the user is on the Yatra home page
    When the user selects journey type as "one-way"
    And the user enters "<fromCity>" as "fromCity"
    And the user enters "<destination_city>" as "destination_city"
    And the user selects "departureDate" "<departureDate>"
    And the user selects "<adults>" adults, "<children>" children and "<infants>" infants
    And the user selects "<travelClass>"
    And the user selects fare type "<fareType>"
    And the user clicks on Search Flights
    Then the user should see the list of available "one-way" flights
    Examples:
      | fromCity | destination_city | departureDate | adults | children | infants | fareType     | travelClass |
      | Pune     | Bangalore        | 15-06-2026    | 5      | 2        | 2       | Armed Forces | economy     |
      #| Delhi    | Pune             | 20-03-2026    | 2      | 1        | 0       | Armed Forces | premium economy |


  Scenario Outline: User searches round-trip flight successfully
    Given the user is on the Yatra home page
    When the user selects journey type as "round-trip"
    And the user enters "<fromCity>" as "fromCity"
    And the user enters "<destination_city>" as "destination_city"
    And the user selects "departureDate" "<departureDate>"
    And the user selects "returnDate" "<returnDate>"
    And the user selects "<adults>" adults, "<children>" children and "<infants>" infants
    And the user selects "<travelClass>"
    And the user selects fare type "<fareType>"
    And the user clicks on Search Flights
    Then the user should see the list of available "round-trip" flights

    Examples:
      | fromCity  | destination_city | departureDate | returnDate | adults | children | infants | fareType | travelClass     |  |
      | Bangalore | New Delhi        | 10-04-2026    | 15-04-2026 | 2      | 0        | 1       | Regular  | premium economy |  |
     # | Mumbai    | Goa              | 05-05-2026    | 10-05-2026 | 3      | 1        | 0       | Student  ||

  @smoke
  Scenario Outline: User searches multi-city flight successfully
    Given the user is on the Yatra home page
    When the user selects journey type as "multi-city"
#    And the user enters city pair 1 "<fromCity1>" to "<toCity1>" with date "<date1>"
    And the user enters city pair "1"
    And the user enters city pair "2"
    And the user selects "<adults>" adults, "<children>" children and "<infants>" infants
    And the user selects "<travelClass>"
#    And the user clicks on Search Flights
#    Then the user should see the list of available "multi-city" flights

    Examples:
      | adults | children | infants | travelClass     |
      | 2      | 1        | 0       | premium economy |

  Scenario Outline: User searches flight with more infants than adults
    Given the user is on the Yatra home page
    When the user selects journey type as "one-way"
    And the user enters "Delhi" as source city
    And the user enters "Mumbai" as destination city
    And the user selects "departureDate" "<departureDate>"
    And the user selects "1" adults, "0" children and "2" infants
    And the user clicks on Search Flights
    Then the user should see an error message stating "Number of infants cannot exceed number of adults"

    Examples:
      | departureDate |
      | 20-03-2026    |

  Scenario Outline: User searches round-trip flight with invalid return date
    Given the user is on the Yatra home page
    When the user selects journey type as "round-trip"
    And the user enters "Delhi" as source city
    And the user enters "Bangalore" as destination city
    And the user selects "departureDate" "<departureDate>"
    And the user selects "returnDate" "<returnDate>"
    And the user clicks on Search Flights
    Then the user should see an error message stating "Return date must be after departure date"

    Examples:
      | departureDate | returnDate |
      | 20-04-2026    | 15-04-2026 |