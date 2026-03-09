package com.guerra.hexagonal.application.ports.out;

import com.guerra.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
