package org.restaurant.crudrestapi.service;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.restaurant.crudrestapi.model.MenuItem;
import org.restaurant.crudrestapi.repository.MenuItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@Slf4j
@Service
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repository;

    @Override
    public MenuItem get(Integer id) {
        Optional<MenuItem> itemOptional = repository.findById(id);
        return itemOptional.orElseThrow(() -> new RuntimeException(format("Item with id=%d not found", id)));
    }

    @Override
    public List<MenuItem> get(int page, int size) {
        Pageable pageRequest = PageRequest.of(page, size);
        Page<MenuItem> pages = repository.findAll(pageRequest);
        return Lists.newArrayList(pages);
    }

    @Override
    public MenuItem save(MenuItem item) {
        return repository.save(item);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
