package org.restaurant.crudrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.restaurant.crudrestapi.model.Bill;
import org.restaurant.crudrestapi.service.BillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @GetMapping("/bills")
    public List<Bill> getAll() {
        return billService.getAll();
    }

    @PostMapping("/bills")
    public Bill save(Bill bill) {
        return billService.save(bill);
    }
}
