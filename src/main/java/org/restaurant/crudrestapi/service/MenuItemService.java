package org.restaurant.crudrestapi.service;

import org.restaurant.crudrestapi.model.MenuItem;

import java.util.List;

public interface MenuItemService {
    MenuItem get(Integer id);

    List<MenuItem> get();

    MenuItem save(MenuItem item);

    void delete(Integer id);
}
