package com.guerra.hexagonal.application.ports.out;

import com.guerra.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
