package com.arantes.cleanarch.config.usecase;

import com.arantes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerByIdUseCase
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerByIdUseCase);
    }
}
