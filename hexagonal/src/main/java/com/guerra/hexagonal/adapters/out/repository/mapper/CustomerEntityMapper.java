package com.guerra.hexagonal.adapters.out.repository.mapper;

import com.guerra.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guerra.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCostumerEntity(Customer customer);
}
