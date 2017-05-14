package com.k15t.pat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.k15t.pat.entity.AddressEntity;

public interface AddressDAO extends JpaRepository<AddressEntity, Integer>
{

}
