package com.sunglowsys.test;

import com.sunglowsys.repository.AddressRepositoryImpl;

public class AddressFindAllTest {
    public static void main(String[] args) {
        System.out.println(new AddressRepositoryImpl().findAll());
    }
}
