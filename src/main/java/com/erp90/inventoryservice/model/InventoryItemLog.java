package com.erp90.inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("inventoryItemLog")
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemLog {
    @Id
    private Integer id;
    private Integer inventoryItemId;
    private String operationType;
    private Integer quantity;
    private Integer materialId;

}
