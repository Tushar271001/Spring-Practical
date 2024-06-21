package com.maven.services.Impl;

import com.maven.entities.Address;
import com.maven.services.AddressService;
import lombok.Data;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Data
@Component
public class AddressServiceImpl implements AddressService {

private HibernateTemplate hibernateTemplate;

    @Override
    public Serializable addAddress(Address address) {
        return  hibernateTemplate.save(address);

    }

    @Override
    public void selectAddress(Address address) {
        Address address1 = hibernateTemplate.get(Address.class, address.getAddressID());
        System.out.println(address1);
    }
}
