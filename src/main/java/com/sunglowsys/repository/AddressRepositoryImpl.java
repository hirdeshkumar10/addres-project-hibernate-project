package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AddressRepositoryImpl implements AddressRepository{
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Address save(Address address) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(address);
        session.close();
        Address address1= session.get(Address.class,id);
        return address;
    }

    @Override
    public Address update(Address address, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address1 = session.get(Address.class,id);
        address1.setAddressLine1(address.getAddressLine1());
        session.update(address1);
        session.getTransaction().commit();
        session.close();
        return address;
    }

    @Override
    public Address findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address1= session.get(Address.class,id);
        session.getTransaction().commit();
        return address1;
    }

    @Override
    public List<Address> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query =  session.createQuery("from Address");
        List<Address> addressList = query.list();
        return addressList;
    }

    @Override
    public AddressRepository delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address = session.get(Address.class,id);
        session.delete(address);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted..."+address);

        return null;
    }
}
