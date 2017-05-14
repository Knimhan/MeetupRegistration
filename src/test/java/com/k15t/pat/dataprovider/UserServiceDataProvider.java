package com.k15t.pat.dataprovider;

import org.testng.annotations.DataProvider;

import com.k15t.pat.dto.UserInDTO;
import com.k15t.pat.entity.UserEntity;

public class UserServiceDataProvider
{
    private UserServiceDataProvider()
    {
        throw new AssertionError();
    }

    @DataProvider
    public static Object[][] getDataForSaveUserWhereEmailIsInvalid()
    {
        String name = "test";
        String email = "test@example.com";
        String password = "test";
        String phone = "12081292";

        UserEntity userEntity = new UserEntity(1, name, email, password, phone);

        UserInDTO userInDTO = new UserInDTO();
        userInDTO.setEmail(email);

        return new Object[][] { { email, userEntity, userInDTO} };
    }
    

    @DataProvider
    public static Object[][] getDataForSaveUserWherePasswordIsLong()
    {
        UserInDTO userInDTO = new UserInDTO();
        userInDTO.setEmail("test1@example.com");
        userInDTO.setPassword("123567890101");
        return new Object[][] { { userInDTO} };
    }
    
    @DataProvider
    public static Object[][] getDataForSaveUserWherePasswordIsShort()
    {
        UserInDTO userInDTO = new UserInDTO();
        userInDTO.setEmail("test1@example.com");
        userInDTO.setPassword("123");
        return new Object[][] { { userInDTO} };
    }
    
}
