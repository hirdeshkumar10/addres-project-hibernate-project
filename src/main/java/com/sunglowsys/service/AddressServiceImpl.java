package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.repository.AddressRepositoryImpl;
import org.hibernate.SessionFactory;

import java.util.List;

public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository  = new AddressRepositoryImpl();

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address, Long id) {
        return addressRepository.update(address,id);
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> findAll() {
        List<Address> addressList = addressRepository.findAll();
        return addressList;
    }

    @Override
    public void delete(Long id) {
        addressRepository.delete(id);

    }
}
