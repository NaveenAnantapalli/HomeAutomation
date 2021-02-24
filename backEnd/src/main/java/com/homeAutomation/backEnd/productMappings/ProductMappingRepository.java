package com.homeAutomation.backEnd.productMappings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMappingRepository extends JpaRepository<ProductMapping,Long> {
}
