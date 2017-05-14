package com.k15t.pat.service;

import com.k15t.pat.dto.UserInDTO;
import com.k15t.pat.dto.UserOutDTO;

public interface UserService
{
    public UserOutDTO save(UserInDTO userInDTO);
}
