package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import com.sunglowsys.service.AddressServiceImpl;

public class AddressUpdateTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddressLine1("Mohanpura");
        new AddressServiceImpl().update(address,1l);
    }
}
