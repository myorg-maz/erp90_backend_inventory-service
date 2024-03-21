package com.erp90.inventoryservice.repository;

import com.erp90.inventoryservice.model.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface WarehouseRepository extends MongoRepository<Warehouse, Integer> {
}
