package com.collectionapi.main.config;

import com.collectionapi.main.model.Item;

import java.util.Comparator;

public class PriceComparator implements Comparator<Item> {
    public int compare(Item i1, Item i2) {
       return i1.getPrice().compareTo(i2.getPrice());
    }
}