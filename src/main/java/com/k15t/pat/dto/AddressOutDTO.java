package com.k15t.pat.dto;

public class AddressOutDTO
{
    private Integer id;

    private String street;

    private String city;

    private String country;

    public AddressOutDTO()
    {
        super();
    }

    public AddressOutDTO(Integer id, String street, String city, String country)
    {
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
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
