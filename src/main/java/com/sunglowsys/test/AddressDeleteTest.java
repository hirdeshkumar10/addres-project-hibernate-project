package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.repository.AddressRepositoryImpl;

public class AddressDeleteTest {
    public static void main(String[] args) {
        AddressRepository addressRepository = new AddressRepositoryImpl();
        addressRepository.delete(3L);
    }
}
