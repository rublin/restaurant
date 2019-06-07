package org.restaurant.crudrestapi.service;

import org.restaurant.crudrestapi.model.Bill;

import java.util.List;

public interface BillService {
    Bill save(Bill bill);

    List<Bill> getAll();
}
