package com.guerra.hexagonal.application.ports.in;

import com.guerra.hexagonal.application.core.domain.Customer;

public class InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
