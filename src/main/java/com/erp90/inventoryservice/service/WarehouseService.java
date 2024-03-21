package com.erp90.inventoryservice.service;

import com.erp90.inventoryservice.dto.WareHouseResponse;
import com.erp90.inventoryservice.dto.WarehouseRequest;

import java.util.List;

public interface WarehouseService {
    WareHouseResponse addWareHouse(WarehouseRequest warehouseRequest);
    List<WareHouseResponse> getAllWarehouse();
}
