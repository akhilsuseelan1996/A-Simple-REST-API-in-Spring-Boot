package com.collectionapi.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.collectionapi.main.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {
}
