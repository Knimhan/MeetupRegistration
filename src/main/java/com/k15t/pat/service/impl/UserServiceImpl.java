package com.k15t.pat.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k15t.pat.beanmapper.BeanMapper;
import com.k15t.pat.dao.AddressDAO;
import com.k15t.pat.dao.UserDAO;
import com.k15t.pat.dto.AddressInDTO;
import com.k15t.pat.dto.UserInDTO;
import com.k15t.pat.dto.UserOutDTO;
import com.k15t.pat.entity.AddressEntity;
import com.k15t.pat.entity.UserEntity;
import com.k15t.pat.exception.BadRequestException;
import com.k15t.pat.exception.ErrorMessage;
import com.k15t.pat.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AddressDAO addressDAO;

    @Autowired
    private BeanMapper beanMapper;

    @Override
    public UserOutDTO save(UserInDTO userInDTO)
    {
        validateEmailAlreadyRegistered(userInDTO.getEmail());
        validatePasswordLength(userInDTO.getPassword());
        UserEntity userEntity = beanMapper.map(userInDTO, UserEntity.class);
        userEntity = userDAO.save(userEntity);
        userEntity.setAddressEntities(saveAddressEntities(userInDTO.getAddressInDTOs(), userEntity));
        return beanMapper.map(userEntity, UserOutDTO.class);
    }

    private void validateEmailAlreadyRegistered(String email)
    {
        if (userDAO.findByEmail(email) != null)
        {
            throw new BadRequestException(new ErrorMessage(com.k15t.pat.exception.ErrorCodes.EMAIL_ALREADY_REGISTERED));
        }
    }

    private void validatePasswordLength(String password)
    {
        if (password.length() < 4)
        {
            throw new BadRequestException(new ErrorMessage(com.k15t.pat.exception.ErrorCodes.PASSWORD_TOO_SHORT));
        }
        else if (password.length() > 10)
        {
            throw new BadRequestException(new ErrorMessage(com.k15t.pat.exception.ErrorCodes.PASSWORD_TOO_LONG));
        }
    }

    private List<AddressEntity> saveAddressEntities(List<AddressInDTO> addressInDTOs, UserEntity userEntity)
    {
        List<AddressEntity> addressEntities = new ArrayList<>();
        for (AddressInDTO addressInDTO : addressInDTOs)
        {
            AddressEntity addressEntity = beanMapper.map(addressInDTO, AddressEntity.class);
            addressEntity.setUserEntity(userEntity);
            addressEntities.add(addressEntity);
        }
        return addressDAO.save(addressEntities);
    }
}
