package Utilities;

public class CityList
{

    private String id;
    private String from_city;
    private String to_city;
    private String departure_date;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getFrom_city()
    {
        return from_city;
    }

    public void setFrom_city(String from_city)
    {
        this.from_city = from_city;
    }

    public String getDeparture_date()
    {
        return departure_date;
    }

    public void setDeparture_date(String departure_date)
    {
        this.departure_date = departure_date;
    }

    public String getTo_city()
    {
        return to_city;
    }

    public void setTo_city(String to_city)
    {
        this.to_city = to_city;
    }
}
