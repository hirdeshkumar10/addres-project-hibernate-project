package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;

import java.util.List;

public interface AddressRepository {

    Address save(Address address);

    Address update(Address address,Long id);

    Address findById(Long id);

    List<Address> findAll();

    AddressRepository delete(Long id);
}
