package Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestDataLoader
{
    public static List<CityList> getTravelDetails() throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        CityListWrapper wrapper = objectMapper.readValue(new File("/Users/shwayton/Documents/JavaProjects/PetStore/YatraWeb/UI/src/test/msls/cityList.json"), CityListWrapper.class);
        return wrapper.getTests();
    }

//    public static void main(String args[]) throws IOException
//    {
//        List<CityList> li = getTravelDetails();
//        for(CityList c : li)
//        {
//            System.out.println(c.getId());
//            System.out.println(c.getFrom_city());
//            System.out.println(c.getTo_city());
//            System.out.println(c.getDeparture_date());
//        }
//    }
}
