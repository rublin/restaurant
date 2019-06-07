package org.restaurant.crudrestapi.repository;

import org.restaurant.crudrestapi.model.MenuItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MenuItemRepository extends PagingAndSortingRepository<MenuItem, Integer> {

}
