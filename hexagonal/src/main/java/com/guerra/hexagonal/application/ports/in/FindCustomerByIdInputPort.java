package com.guerra.hexagonal.application.ports.in;

import com.guerra.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
