package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepositoryImpl;

public class AddressFindByIdTest {
    public static void main(String[] args) {
        System.out.println(new AddressRepositoryImpl().findById(2L));
    }
}
