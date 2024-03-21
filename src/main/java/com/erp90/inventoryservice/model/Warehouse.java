package com.erp90.inventoryservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("warehouse")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Warehouse {
    @Id
    private String id;
    private String name;
    private String address;
}
