package com.guerra.hexagonal.config;


import com.guerra.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guerra.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.guerra.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.guerra.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.guerra.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
