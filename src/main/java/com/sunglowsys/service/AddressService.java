package com.sunglowsys.service;

import com.sunglowsys.domain.Address;

import java.util.List;

public interface AddressService {

    Address save(Address address);

    Address update(Address address,Long id);

    Address findById(Long id);

    List<Address> findAll();

    void delete(Long id);
}
