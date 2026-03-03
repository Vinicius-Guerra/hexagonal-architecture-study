package com.guerra.hexagonal.application.ports.out;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
