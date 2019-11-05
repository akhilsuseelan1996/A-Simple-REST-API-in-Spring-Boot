package com.collectionapi.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.collectionapi.main.model.Item;
import com.collectionapi.main.repository.ItemRepository;
import com.collectionapi.main.config.PriceComparator;

import java.util.List;
import java.util.UUID;

@RestController
public class ItemController {

    @Autowired
    private
    ItemRepository itemRepository;

    @GetMapping("/getAllItems")
    public List<Item> getAllItem() {

        List<Item> itemList = itemRepository.findAll();
        // sorting by highest price
        itemList.sort(new PriceComparator().reversed());
        return itemList;
    }

    @PostMapping("/addItems")
    public Item addItem(@RequestBody Item item) {

        Item items = new Item(UUID.randomUUID(), item.getDescription(), item.getBrand(), item.getPrice());
        itemRepository.insert(items);
        return items;
    }
}