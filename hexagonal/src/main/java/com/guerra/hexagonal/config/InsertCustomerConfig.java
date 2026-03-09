package com.guerra.hexagonal.config;

import com.guerra.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guerra.hexagonal.adapters.out.InsertCustomerAdapter;
import com.guerra.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.guerra.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
