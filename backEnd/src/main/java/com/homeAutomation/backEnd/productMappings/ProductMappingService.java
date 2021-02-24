package com.homeAutomation.backEnd.productMappings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMappingService {

    private final ProductMappingRepository ProductMappingRepository;

    @Autowired

    public ProductMappingService(com.homeAutomation.backEnd.productMappings.ProductMappingRepository productMappingRepository) {
        ProductMappingRepository = productMappingRepository;
    }
}
