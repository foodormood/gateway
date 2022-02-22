package com.thetinydev.controller;

import com.thetinydev.model.Item;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class ItemController {

    @QueryMapping
    public List<Item> items() {
        Item item = new Item();
        item.setId("same");
        item.setName("Sample");
        return Arrays.asList(item);
    }
}
