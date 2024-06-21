package com.maven.services;

import com.maven.entities.Address;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public interface AddressService {
    Serializable addAddress(Address address);

    void selectAddress(Address address);
}
