package org.restaurant.crudrestapi.service;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.restaurant.crudrestapi.model.Bill;
import org.restaurant.crudrestapi.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {

    private final BillRepository billRepository;

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public List<Bill> getAll() {
        return Lists.newArrayList(billRepository.findAll());
    }
}
