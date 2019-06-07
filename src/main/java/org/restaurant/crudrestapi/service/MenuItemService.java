package org.restaurant.crudrestapi.service;

import org.restaurant.crudrestapi.model.MenuItem;

import java.util.List;

public interface MenuItemService {
    MenuItem get(Integer id);

    List<MenuItem> get(int page, int size);

    MenuItem save(MenuItem item);

    void delete(Integer id);

    List<MenuItem> find(String name);
}
