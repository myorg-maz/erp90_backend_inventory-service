package com.erp90.inventoryservice.controller;

import com.erp90.inventoryservice.dto.WareHouseResponse;
import com.erp90.inventoryservice.dto.WarehouseRequest;
import com.erp90.inventoryservice.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/warehouse")
@RequiredArgsConstructor
public class WarehouseController {
    private final WarehouseService warehouseService;
    @PostMapping
    public ResponseEntity<WareHouseResponse> addWareHouse(@RequestBody WarehouseRequest warehouseRequest){
        return new ResponseEntity<>(warehouseService.addWareHouse(warehouseRequest), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<WareHouseResponse>> getAllWarehouse(){
        return new ResponseEntity<>(warehouseService.getAllWarehouse(), HttpStatus.OK);
    }
}
