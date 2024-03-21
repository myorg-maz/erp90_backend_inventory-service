package com.erp90.inventoryservice.repository;

import com.erp90.inventoryservice.model.InventoryEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryItemRepository extends MongoRepository<InventoryEntry, Integer> {

}
