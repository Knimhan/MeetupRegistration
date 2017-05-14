package com.k15t.pat.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k15t.pat.dto.UserInDTO;
import com.k15t.pat.dto.UserOutDTO;
import com.k15t.pat.service.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource
{

    // Extend the current resource to receive and store the data in memory.
    // Return a success information to the user including the entered information.
    // In case of the address split the information into a better format/structure
    // for better handling later on.

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public UserOutDTO save(@RequestBody(required = true) UserInDTO userInDTO)
    {
        return userService.save(userInDTO);
    }

}
