package com.erp90.inventoryservice.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("inventoryEntry")
@NoArgsConstructor
@AllArgsConstructor
public class InventoryEntry {
    @Id
    private Integer id;
    private Integer materialId;
    private Integer warehouseId;
    private Integer quantity;
    private Integer ownerDepartmentId;
    private Integer purchaseOrderNumber;
    private Integer reservationNumber;
    private Boolean requisition;
    private Instant createdOn;
    private Instant updatedOn;
    private String updatedBy;
}
