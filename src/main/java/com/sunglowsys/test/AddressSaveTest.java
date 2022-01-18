package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.repository.AddressRepositoryImpl;

public class AddressSaveTest {
    public static void main(String[] args) {
        Address address = new Address("Village-Khurrampur,post-kantaur,Dist-kasganj","no","3 monkey gate","Kasganj","Uttar Pradesh","India","207123");
        new AddressRepositoryImpl().save(address);
        System.out.println("saved: "+address);
    }
}
