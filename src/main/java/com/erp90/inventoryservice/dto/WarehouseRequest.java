package com.erp90.inventoryservice.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;
@Data
@Builder
public class WarehouseRequest {

    private String name;
    private String address;
}
