package com.k15t.pat.dto;

public class AddressInDTO
{
    private String street;

    private String city;

    private String country;

    public AddressInDTO()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public AddressInDTO(String street, String city, String country)
    {
        super();
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
    
}
