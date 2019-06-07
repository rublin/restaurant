package org.restaurant.crudrestapi.repository;

import org.restaurant.crudrestapi.model.Bill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BillRepository extends PagingAndSortingRepository<Bill, Integer> {
}
