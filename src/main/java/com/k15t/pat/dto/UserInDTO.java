package com.k15t.pat.dto;

import java.util.List;

public class UserInDTO
{
    private String name;

    private String email;

    private String password;
    
    private String phone;

    private List<AddressInDTO> addressInDTOs;
    

    public UserInDTO()
    {
        super();
    }

    public UserInDTO(String name, String email, String password, String phone, List<AddressInDTO> addressInDTOs)
    {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.addressInDTOs = addressInDTOs;
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

    public List<AddressInDTO> getAddressInDTOs()
    {
        return addressInDTOs;
    }

    public void setAddressInDTOs(List<AddressInDTO> addressInDTOs)
    {
        this.addressInDTOs = addressInDTOs;
    }
    
}
