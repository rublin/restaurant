package org.restaurant.crudrestapi.repository;

import org.restaurant.crudrestapi.model.MenuItem;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface MenuItemRepository extends PagingAndSortingRepository<MenuItem, Integer> {
    List<MenuItem> findByNameIgnoreCaseContaining(String name);
}
