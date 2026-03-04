package Utilities;

import POJO.FlightSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePicker extends BaseClass
{
    public WebDriver driver = getDriver();
    FlightSearch flightSearch = new FlightSearch(driver);

    public enum MonthEnum
    {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private final int monthNumber;

        MonthEnum(int monthNumber)
        {
            this.monthNumber = monthNumber;
        }

        public int getMonthNumber()
        {
            return monthNumber;
        }

        public static int getMonthNumber(String monthName)
        {
            return MonthEnum.valueOf(monthName.trim().toUpperCase())
                    .getMonthNumber();
        }

    }

    public void selectDate(String date)
    {
        System.out.println("date: "+date);
        String[] targetDateComp = date.split("-");

        if(targetDateComp[0].charAt(0)=='0')
            targetDateComp[0] = targetDateComp[0].substring(1);

        String currentMonthYearFromSite = flightSearch.getCurrentMonthYear().getText();
        String[] currentMonthYear = currentMonthYearFromSite.split(" ");
        //"February 2026";

        //SCROLL-YEAR
        if (Integer.parseInt(targetDateComp[2]) < Integer.parseInt(currentMonthYear[1]))
            System.out.println("Error");

        else {
            for (int i = 1; i <= Integer.parseInt(targetDateComp[2]) - Integer.parseInt(currentMonthYear[1]); i++)
                clickElement(flightSearch.getNextMonthBtn());
        }

        //SCROLL-MONTH
        int currMonth = MonthEnum.getMonthNumber(currentMonthYear[0]);
        int targetMonth = Integer.parseInt(targetDateComp[1]);

        if (currMonth > targetMonth)
            System.out.println("Error");

        else {
            for (int i = 1; i <= targetMonth - currMonth; i++)
                clickElement(flightSearch.getNextMonthBtn());
        }

        //SCROLL-DAY
        //Month-Block
        //div[contains(@aria-label, '2026-02')]/div/div/span
        String monthPath = "";
        if(targetMonth<=9)
           // monthPath = "//div[contains(@aria-label,'" + targetDateComp[2] + "-0" + String.valueOf(targetMonth) + "')]/div/div/span";
        monthPath = "//div[contains(@aria-label,'" + targetDateComp[2] + "-0" + String.valueOf(targetMonth) + "')]/div/div";
        else
            //monthPath = "//div[contains(@aria-label,'" + targetDateComp[2] + "-" + String.valueOf(targetMonth) + "')]/div/div/span";
            monthPath = "//div[contains(@aria-label,'" + targetDateComp[2] + "-" + String.valueOf(targetMonth) + "')]/div/div";

        List<WebElement> listOfDays = getListOfElements(monthPath);

        for (WebElement ele : listOfDays) {
            if (ele.getText().equalsIgnoreCase(targetDateComp[0])) {
                clickElement(ele);
                break;
            }
        }

    }
}
