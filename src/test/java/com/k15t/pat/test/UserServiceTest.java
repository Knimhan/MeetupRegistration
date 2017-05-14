package com.k15t.pat.test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.k15t.pat.dao.UserDAO;
import com.k15t.pat.dataprovider.UserServiceDataProvider;
import com.k15t.pat.dto.UserInDTO;
import com.k15t.pat.entity.UserEntity;
import com.k15t.pat.exception.BadRequestException;
import com.k15t.pat.exception.ErrorCodes;
import com.k15t.pat.service.UserService;
import com.k15t.pat.service.impl.UserServiceImpl;

public class UserServiceTest
{
    @Mock
    private UserDAO userDAO;

    @InjectMocks
    private UserService userService;

    @BeforeMethod
    public void initMock()
    {
        userService = new UserServiceImpl();
        MockitoAnnotations.initMocks(this);
    }

    @Test(dataProvider = "getDataForSaveUserWhereEmailIsInvalid", dataProviderClass = UserServiceDataProvider.class)
    public void shouldThrowBadRequestExceptionForInvalidEmailSaveUser(String email, UserEntity userEntity, UserInDTO userInDTO)
    {
        when(userDAO.findByEmail(email)).thenReturn(userEntity);
        try
        {
            userService.save(userInDTO);
            Assert.fail("Expected exception to be thrown");
        }
        catch (BadRequestException exception)
        {
            assertEquals(exception.getErrorMessage().getCode(), ErrorCodes.EMAIL_ALREADY_REGISTERED.getCode());
        }
    }
    
    @Test(dataProvider = "getDataForSaveUserWherePasswordIsLong", dataProviderClass = UserServiceDataProvider.class)
    public void shouldThrowBadRequestExceptionForLongPasswordSaveUser(UserInDTO userInDTO)
    {
        try
        {
            userService.save(userInDTO);
            Assert.fail("Expected exception to be thrown");
        }
        catch (BadRequestException exception)
        {
            assertEquals(exception.getErrorMessage().getCode(), ErrorCodes.PASSWORD_TOO_LONG.getCode());
        }
    }
    
    @Test(dataProvider = "getDataForSaveUserWherePasswordIsShort", dataProviderClass = UserServiceDataProvider.class)
    public void shouldThrowBadRequestExceptionForShortPasswordSaveUser(UserInDTO userInDTO)
    {
        try
        {
            userService.save(userInDTO);
            Assert.fail("Expected exception to be thrown");
        }
        catch (BadRequestException exception)
        {
            assertEquals(exception.getErrorMessage().getCode(), ErrorCodes.PASSWORD_TOO_SHORT.getCode());
        }
    }
}
