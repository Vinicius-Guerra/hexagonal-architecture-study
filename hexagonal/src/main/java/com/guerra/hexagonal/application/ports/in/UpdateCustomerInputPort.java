package com.guerra.hexagonal.application.ports.in;

import com.guerra.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
