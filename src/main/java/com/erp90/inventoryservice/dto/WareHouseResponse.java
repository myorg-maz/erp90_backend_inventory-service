package com.erp90.inventoryservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WareHouseResponse {
    private String id;
    private String name;
    private String address;
}
