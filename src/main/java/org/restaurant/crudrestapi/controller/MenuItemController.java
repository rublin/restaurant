package org.restaurant.crudrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.restaurant.crudrestapi.model.MenuItem;
import org.restaurant.crudrestapi.service.MenuItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService itemService;

    @PostMapping("/menu/items")
    public ResponseEntity<MenuItem> create(@Valid @RequestBody MenuItem item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.save(item));
    }

    @PutMapping("/menu/items/{id}")
    public MenuItem update(@PathVariable("id") Integer id, @Valid @RequestBody MenuItem item) {
        item.setId(id);
        return itemService.save(item);
    }

    @GetMapping("/menu/items/{id}")
    public MenuItem get(@PathVariable("id") Integer id) {
        return itemService.get(id);
    }

    @GetMapping("/menu/items")
    public List<MenuItem> getAll(@RequestParam @NotNull Integer page, @RequestParam @NotNull Integer size) {
        return itemService.get(page, size);
    }

    @GetMapping("/menu/items/search")
    public List<MenuItem> findByName(@RequestParam @NotNull String name) {
        return itemService.find(name);
    }

    @DeleteMapping("/menu/items/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        itemService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
