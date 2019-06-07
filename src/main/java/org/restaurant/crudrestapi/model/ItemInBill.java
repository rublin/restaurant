package org.restaurant.crudrestapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class ItemInBill {

    @Id
    private Bill bill;
    @Id
    private MenuItem item;
    private Integer quantity;
}
