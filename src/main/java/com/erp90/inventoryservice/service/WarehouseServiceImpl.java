package com.erp90.inventoryservice.service;


import com.erp90.inventoryservice.dto.WareHouseResponse;
import com.erp90.inventoryservice.dto.WarehouseRequest;
import com.erp90.inventoryservice.model.Warehouse;
import com.erp90.inventoryservice.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseRepository warehouseRepository;
    @Override
    public WareHouseResponse addWareHouse(WarehouseRequest warehouseRequest) {
        Warehouse warehouse= Warehouse.builder().name(warehouseRequest.getName()).address(warehouseRequest.getAddress()).build();
        warehouseRepository.save(warehouse);
        return WareHouseResponse.builder().name(warehouse.getName()).id(warehouse.getId()).address(warehouse.getAddress()).build();
    }
    @Override
    public List<WareHouseResponse> getAllWarehouse() {
        return  warehouseRepository.findAll().stream().map(warehouse ->
                WareHouseResponse.builder().id(warehouse.getId()).name(warehouse.getName()).address(warehouse.getAddress()).build())
                .toList();
    }

}
