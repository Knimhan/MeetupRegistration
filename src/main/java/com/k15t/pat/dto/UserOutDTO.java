package com.k15t.pat.dto;

import java.util.List;

public class UserOutDTO
{
    private Integer id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private List<AddressOutDTO> addressOutDTOs;

    public UserOutDTO()
    {
        super();
    }

    public UserOutDTO(Integer id, String name, String email, String password, String phone, List<AddressOutDTO> addressOutDTOs)
    {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.addressOutDTOs = addressOutDTOs;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public List<AddressOutDTO> getAddressOutDTOs()
    {
        return addressOutDTOs;
    }

    public void setAddressOutDTOs(List<AddressOutDTO> addressOutDTOs)
    {
        this.addressOutDTOs = addressOutDTOs;
    }

    @Override
    public String toString()
    {
        return "UserOutDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
    }  
}
